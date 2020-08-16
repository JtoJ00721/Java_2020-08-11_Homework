package com.homework.tool;

public class LineTool {
	
	public static String DLine(int num) {
		
		String dLine = "";
		for(int i = 0; i < num ; i++ ) {
			dLine += "=";
		}
		return dLine;
	}
	
	public static String SLine(int num) {
		
		String sLine = "";
		for(int i = 0; i < num ; i++ ) {
			sLine += "-";
		}
		return sLine;
	}

}
