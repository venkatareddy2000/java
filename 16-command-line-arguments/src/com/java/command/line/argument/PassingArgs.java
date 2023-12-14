package com.java.command.line.argument;

public class PassingArgs {

	public static void main(String[] args) {

		/*
		 * Command line arguments will be used to pass an array of string values to the
		 * main method during runtime and these arguments will be stored in the args[]
		 * and we can use these where ever required in the program.
		 * 
		 * To pass the arguments, right click on the file select run configurations
		 * click on launch new configuration tab and pass the argument with a space
		 * between the arguments in the argument tab.
		 *
		 */

		/* Passing the arguments through command line and printing on the screen */
		int length = args.length;
		if (length == 0) {
			System.out.println("There are no arguments present");
		} else {
			System.out.println("List of arguments");
			for (int i = 0; i < length; i++) {
				System.out.println(args[i]);
			}
		}
	}

}
