package com.venky.exception.handling.unchecked;

public class ExceptionClassHierarchy {

	public static void main(String[] args) {
		/*
		 * All the exception class in java inherits from a parent class called
		 * throwable.
		 * 
		 * This throwable has two child classes one is Exception and the other is Errors
		 * 
		 * All the exception that falls under Error class, we cannot handle those
		 * exceptions through our program. Ex:NoClassDefinitionFound, OutofMemory,
		 * NoSuchMethodException.
		 * 
		 * All the classes that inherits directly from exception class is called checked
		 * exceptions. Ex: IoException, SQLException, FileNotFoundException
		 * 
		 * The RuntimeException is derived from Exception class and the classes that
		 * inherits runtime exceptions class are called unchecked exception. Ex:
		 * Arithmetic Exception, Null Pointer Exception
		 * 
		 * To handle exception we use keywords like try, catch, throw, throws, and
		 * finally.
		 * 
		 * We will keep the code that might cause exception in the try block
		 * 
		 * try
		 * 
		 * { Code that cause exception }
		 * 
		 * We will use catch block to catch that exception and display the message
		 * 
		 * catch(Exception obj)
		 * 
		 * {
		 * 
		 * code to handle exception
		 * 
		 * }
		 * 
		 * If we handle the exception then the program will continue execution without
		 * any issues.
		 */
	}

}
