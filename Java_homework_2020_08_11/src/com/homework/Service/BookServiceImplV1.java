package com.homework.Service;

import java.util.Scanner;

import com.homework.model.BookVO;
import com.homework.tool.LineTool;

public class BookServiceImplV1 implements BookService{

	BookVO bVO = new BookVO();
	
	@Override
	public boolean input() {
		
		Scanner scan = new Scanner(System.in);
		ShowInputProblem showIP = new ShowInputProblem();
		
		String strBCode = "";
		String strBName = "";
		
		while(true) {
		
			System.out.print("도서코드(quit:입력취소) \n>> ");
			strBCode = scan.nextLine();
			
			if(strBCode.equals("quit")) {
				return false;
			}
			
			int intBCodeLength = strBCode.length();
			if(intBCodeLength < 0 || intBCodeLength > 5) {
				showIP.BCodeToLong();
				continue;
			}
			
			int intBCode = 0;
			try {
				intBCode = Integer.valueOf(strBCode);
			} catch (Exception e) {
				showIP.BCodeIsNotNumber();
				continue;
			}
			
			// 도서 코드는 5자리 숫자형 문자열로 변환한다
			// 00001
			strBCode = String.format("%05d", intBCode);
			
			break;
		}
		
		while(true) {
			System.out.print("도서명(quit:입력취소) \n>> ");
			strBName = scan.nextLine();
			
			if(strBName.equals("quit")) {
				return false;
			}
			
			if(strBName.isEmpty()) {
				System.out.println("도서명은 반드시 입력해야 합니다");
				continue;
			}
			
			break;
		}
		
			bVO.setBookCode(strBCode);
			bVO.setBookName(strBName);
			
			return true;
	}

	@Override
	public void output() {
		
		if(bVO.getBookCode() == null || bVO.getBookName() == null) {
			System.out.println("\n\n입력을 취소했습니다 ><\n\n");
		}else {
			System.out.println("\n\n"+LineTool.DLine(30));
			System.out.println("입력한 도서정보");
			System.out.println(LineTool.SLine(30));
			System.out.printf("도서코드 : %s\n",bVO.getBookCode());
			System.out.printf("도서명 : %s\n",bVO.getBookName());
			System.out.println(LineTool.DLine(30)+"\n\n");
			
		}


		
	}

}
