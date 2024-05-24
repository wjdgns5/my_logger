package com.tenco;

public class MainTest {

	public static void main(String[] args) {
		
		MyLogger.logToConsole("실행 1");
		System.out.println("--------");
		
		MyLogger.logToFile("예외 확인 null Pointer");
		System.out.println("-----------------");
		
		MyLogger.logToFile("예외 확인 형 변환 오류 발생");

	} // end of main

} // end of class
