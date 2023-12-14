package com.java.nonstaticmembers;

public class NonStaticMembers {

	/* Creating a non-static variable */
	int num;

	/* Creating a non-static constructor */
	NonStaticMembers() {
		System.out.println("Inside the non-static constructor");
	}

	/* Creating a non-static block */
	{
		System.out.println("inside the non-static block");
	}

	/* Creating a non static method */
	void doNothing() {
		System.out.println("I am not doing anything in doNothing method");
	}

	public static void main(String[] args) {
		
		/*
		 * To call non-static members inside a static method we have to create objects
		 * for the class
		 */
		System.out.println("Inside the main function before the creating the object");
		NonStaticMembers nonStatic = new NonStaticMembers();
		System.out.println(nonStatic.num);
		System.out.println("Inside the main method after the completion of the non static call");
		
		/* Creating the new multiple instance for the class */
		new NonStaticMembers();
		new NonStaticMembers();

		/* calling the non-static method with the help of non-static variable */
		nonStatic.doNothing();
	}

	/*
	 * The key difference between a static and non static block is that a static
	 * block will be executed only once where as the non static block and non static
	 * constructor will be executed for every new object creation
	 */
	static {
		System.out.println("Inside the static block");
	}

}
