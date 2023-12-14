package com.venky.file.io.inputputstream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamExample2 {

	public static void main(String[] args) {
		FileInputStream fileInputStream = null;
		try {
			fileInputStream = new FileInputStream("venky.txt");
			int read = 0;
			while ((read = fileInputStream.read()) != -1) {
				System.out.print((char) read);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			System.err.println("File not found");
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("IO Exception");
		} finally {
			try {
				fileInputStream.close();
			} catch (IOException e) {
				e.printStackTrace();
				System.err.println("Error in closing the file");
			}
		}
	}

}
