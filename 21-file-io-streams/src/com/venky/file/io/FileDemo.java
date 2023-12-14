package com.venky.file.io;

import java.io.File;
import java.io.IOException;

public class FileDemo {

	public static void main(String[] args) {

		/* Creating a new file */
		File file = new File("venkata reddy.txt");
		if (!file.exists()) {
			try {
				file.createNewFile();
				System.out.println("File created successfully!");
			} catch (IOException e) {
				e.printStackTrace();
			}
		} else {
			System.out.println("File already exists");
		}

	}

}
