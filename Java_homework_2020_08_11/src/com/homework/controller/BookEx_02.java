package com.homework.controller;

import java.util.Scanner;

import com.homework.Service.BookControllServiceImpl;

/*
 * 
 * 키보드를 사용하여 도서코드와 도서정보를 입력받아 Console에 표시하시오
 * 
 * 요구조건
 * 	1. 도서코드는 1 ~ 5 이내의 숫자로 입력
 *  2. 입력된 도서코드는 5자리의 숫자형 문자열로 변환
 *  	1 => 00001, 101=> 00101
 *  3. 조건에 맞지 않은 도서코드를 입력하면 
 *  	안내 메시지를 보여주고 도서코드를다시 입력받아야 함
 *  4. 도서명은 반드시 입력해야 함
 *  5. 도서명을 입력하지 않고 Enter를 누르면 도서명을 다시 입력받아야 함
 *   
 */
public class BookEx_02 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		BookControllServiceImpl controllServ = new BookControllServiceImpl();
		
		while(true) {
			controllServ.ServiceIntroduce();
			
			String breakPoint = scan.nextLine();
			
			if(breakPoint.equals("off")) {
				break;
			}
			
			controllServ.bookInOut();
		}
		scan.close();
		controllServ.goHome();
		
		
	}

}