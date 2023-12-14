package com.venky.file.io.outputstream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamExample2 {

	public static void main(String[] args) {
		FileOutputStream fileOutputStream = null;
		try {
			fileOutputStream = new FileOutputStream("venky.txt");
			String name = "venkata reddy challa";
			/* converting the string into array of byte */
			byte[] bytes = name.getBytes();
			fileOutputStream.write(bytes);
			System.out.println("Successfully written the data to the file");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			System.err.println("File not found");
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("IO Exception");
		} finally {
			try {
				fileOutputStream.close();
			} catch (IOException e) {
				e.printStackTrace();
				System.err.println("Error in closing the file");
			}
		}
	}

}
