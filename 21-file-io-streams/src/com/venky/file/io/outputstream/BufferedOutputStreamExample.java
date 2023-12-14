package com.venky.file.io.outputstream;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedOutputStreamExample {

	public static void main(String[] args) {
		FileOutputStream fileOutputStream = null;
		BufferedOutputStream bufferedOutputStream = null;
		try {
			fileOutputStream = new FileOutputStream("venky.txt");
			bufferedOutputStream = new BufferedOutputStream(fileOutputStream);
			String name = "venkata reddy challa";
			/* converting the string into array of byte */
			byte[] bytes = name.getBytes();
			bufferedOutputStream.write(bytes);
			System.out.println("Successfully written the data to the file");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			System.err.println("File not found");
		} catch (IOException e) {
			e.printStackTrace();
			System.err.println("IO Exception");
		} finally {
			try {
				bufferedOutputStream.flush();
				bufferedOutputStream.close();
				fileOutputStream.close();
			} catch (IOException e) {
				e.printStackTrace();
				System.err.println("Error in closing the file");
			}
		}
	}

}
