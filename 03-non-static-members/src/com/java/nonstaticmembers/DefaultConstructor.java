package com.java.nonstaticmembers;

public class DefaultConstructor {

	/*
	 * If there is no constructor created in the class by the programmer, the
	 * compiler will automatically create one constructor. So we don't get any
	 * compilation error even without having a constructor.
	 * 
	 * When ever a new object is created for the the class the non-static blocks
	 * will be initialized and it will print the data inside the not static block
	 * and if there are many non static blocks , it will be executed in the order
	 * from top top to bottom. The constructor will be executed after all the
	 * executions of non static blocks.
	 */

	/* Non-static block 1 */
	{
		System.out.println("Inside the non-static block1");
	}

	/* Non-static block 2 */
	{
		System.out.println("Inside the non-static block2");
	}

	/* Creating a constructor */
	DefaultConstructor() {
		System.out.println("From the default constructor!!");
	}

	public static void main(String[] args) {

		/* Creating new instance for the class */
		new DefaultConstructor();
		
		/*
		 * The order of the execution is Non - static block1, Non - static block2,
		 * Constructor .
		 * 
		 * The program will execute with out any issues.
		 */

	}

}
