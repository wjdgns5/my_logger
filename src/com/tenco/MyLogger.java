package com.tenco;

public class MyLogger {
	private static ConsoleLogger consoleLogger = new ConsoleLogger();
	private static FileLogger fileLogger = new FileLogger("mLogger.txt");
	
	// 콘솔창에 로그를 찍는 기능
	public static void logToConsole(String message) {
		consoleLogger.log(message);
	}
	
	//  콘솔창 + 파일에 저장하는 기능
	public static void logToFile(String message) {
		logToConsole(message);
		fileLogger.log(message);
	}
	
} // end of class
