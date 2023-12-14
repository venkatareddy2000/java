package com.venky.file.io.inputputstream;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class BufferedInputStreamExample {

	public static void main(String[] args) {
		FileInputStream fileInputStream = null;
		BufferedInputStream bufferedInputStream = null;
		try {
			fileInputStream = new FileInputStream("venky.txt");
			bufferedInputStream = new BufferedInputStream(fileInputStream);
			int read = 0;
			while ((read = bufferedInputStream.read()) != -1) {
				System.out.print((char) read);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			System.err.println("File not found");
		} catch (IOException e) {
			e.printStackTrace();
			System.err.println("IO Exception");
		} finally {
			try {
				bufferedInputStream.close();
				fileInputStream.close();
			} catch (IOException e) {
				e.printStackTrace();
				System.err.println("Error in closing the file");
			}
		}
	}

}
