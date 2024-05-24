package com.tenco;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileLogger {
	
	private String fileName;
	private SimpleDateFormat dataFormat;
	
	public FileLogger(String fileName) {
		this.fileName = fileName;
		// 현재시간 2024-05-21-16:10:50
		this.dataFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	} // 생성자
	
	public void log(String message) {
		try(
				BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true));
				) {
			// 현재 시간
			String now = dataFormat.format(new Date());
			writer.write(now + " :: " +message);
			writer.newLine();
			writer.flush();
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
	public void readLogs() {
		try(
				BufferedReader reader = new BufferedReader(new FileReader(fileName))
				) {
			String line;
			while( (line = reader.readLine()) != null ) {
				System.out.println(line);
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
} // end of class
