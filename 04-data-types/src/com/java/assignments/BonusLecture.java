package com.java.assignments;

public class BonusLecture {
	/*
	 * Static Variables (Class Variables):
	 * 
	 * Definition: Variables declared with the static keyword within a class, but
	 * outside any method, constructor, or block. Scope: Belong to the class rather
	 * than an instance and can be accessed using the class name. Lifetime: Exist as
	 * long as the class is loaded in memory.
	 */
	static String BankName;

	/*
	 * Instance Variables (Non-Static Fields):
	 * 
	 * Definition: Variables declared within a class but outside any method,
	 * constructor, or block. Scope: Belong to the instance of the class and can be
	 * accessed by any method or block within the class. Lifetime: Exist as long as
	 * the instance of the class exists.
	 */
	String AccountHolderName;
	float Balance;

	public static void main(String[] args) {

		/*
		 * To access a static variable we use ClassName.VariableName. The life span of a
		 * static variable is as long as the class is loaded in the JVM. If we don't
		 * assign any values to the static variable, it will assign some default values
		 * according to the data type
		 */
		System.out.println(BonusLecture.BankName);

		/*
		 * To access a non-static variables and methods we need to create an instances
		 * of the class and the non-static variable will stored in heap memory and life
		 * span of a non-static variable is till the scope of instance. The non-static
		 * variables will assigned a default values, if we don't initialize it.
		 */

		/* created an object for class BonusLecture */
		BonusLecture obj = new BonusLecture();
		System.out.println(obj.AccountHolderName);
		System.out.println(obj.Balance);

		/*
		 * Local Variables : Variables that are declared in methods and the life time of
		 * these variable is till the execution of the function and these local
		 * variables are stored in stack memory. We have to initialize a local variable
		 * as it will thrown an error if not.
		 */
		double Salary = 2000000d;
		System.out.println(Salary);
	}

}
