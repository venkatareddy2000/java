package com.venky.file.io.serialization.deserialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Deserialization {

	public static void main(String[] args) {
		FileInputStream fileInputStream = null;
		ObjectInputStream objectInputStream = null;
		try {
			fileInputStream = new FileInputStream("challa venkata reddy.txt");
			objectInputStream = new ObjectInputStream(fileInputStream);
			Object object = objectInputStream.readObject();
			Employee employee = (Employee) object;
			System.out.println("Employee name : " + employee.name);
			System.out.println("Employee id : " + employee.id);
			System.out.println("Employee branch : " + employee.branch);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} finally {
			try {
				objectInputStream.close();
				fileInputStream.close();
			} catch (IOException e) {
				e.printStackTrace();
			}

		}

	}

}
