package com.venky.file.io.reader;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo {

	public static void main(String[] args) {
		FileReader fileReader = null;
		try {
			fileReader = new FileReader("venkata reddy.txt");
			int read = 0;
			while ((read = fileReader.read()) != -1) {
				System.out.print((char) read);
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fileReader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
