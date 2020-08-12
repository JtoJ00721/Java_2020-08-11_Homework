package com.homework.Service;

import com.homework.tool.LineTool;

public class BookControllServiceImpl implements BookControllService {
	
	LineTool line = new LineTool();
	
	@Override
	public void ServiceIntroduce() {
		System.out.println(line.DLine(45));
		System.out.println("도서구매 시스템 V1");
		System.out.println(line.SLine(45));
		System.out.print("서비스를 종료하시려면 off 라고 입력해 주세요\n"
				+ "구매한 책을 등록하고 정보를 보시려면\n"
				+ "off 이외 아무 문자나 입력해 주세요  >>");
	}
	
	@Override
	public void bookInOut() {
		BookService bServ = new BookServiceImplV1();
		
		bServ.input();
		bServ.output();
	}
	
	@Override
	public void goHome() {
		System.out.println("\n\n\n서비스 프로그램이 종료됩니다\n"
				+ "developer of this stupid program >>>>> 쩔쩔이(J to J) <<<<<\n"
				+ "version 1.1.1"
				+ " release date of this foolish program >>>>> 2020-08-11 <<<<<\n\n"
				+ "퇴근이지롱 ><");
	}
	
	
}
