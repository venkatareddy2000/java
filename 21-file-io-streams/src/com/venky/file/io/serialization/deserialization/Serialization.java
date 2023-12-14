package com.venky.file.io.serialization.deserialization;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Serialization {

	public static void main(String[] args) {
		Employee employee = new Employee();
		employee.name = "Venkata Reddy";
		employee.id = 12345;
		employee.branch = "Software engineer";

		File file = new File("challa venkata reddy.txt");
		FileOutputStream fileOutputStream = null;
		ObjectOutputStream objectOutputStream = null;
		try {
			file.createNewFile();
			System.out.println("File created successfully!");
			fileOutputStream = new FileOutputStream("challa venkata reddy.txt");
			objectOutputStream = new ObjectOutputStream(fileOutputStream);
			objectOutputStream.writeObject(employee);
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				objectOutputStream.close();
				fileOutputStream.close();
			} catch (IOException e) {
				e.printStackTrace();
			}

		}
	}

}
