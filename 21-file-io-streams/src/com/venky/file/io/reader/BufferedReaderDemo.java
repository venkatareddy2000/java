package com.venky.file.io.reader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderDemo {

	public static void main(String[] args) {
		FileReader fileReader = null;
		BufferedReader bufferedReader = null;
		try {
			fileReader = new FileReader("venkata reddy.txt");
			bufferedReader = new BufferedReader(fileReader);
			int read = 0;
			while ((read = bufferedReader.read()) != -1) {
				System.out.print((char) read);
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				bufferedReader.close();
				fileReader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
