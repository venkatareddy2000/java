package com.java.nonstaticmembers;

public class ObjectReference {

	/*
	 * In Java, an object reference is a variable that holds the memory address (or
	 * reference) of an object rather than the actual object itself. When you create
	 * an object using the new keyword, the object is allocated memory on the heap,
	 * and the reference variable is used to point to that memory location. This
	 * allows you to access and manipulate the object's attributes and behavior
	 * through the reference.
	 */

	int x;

	public ObjectReference() {

	}

	public static void main(String[] args) {

		/*
		 * Declaration of reference variable and this variable won't hold any memory
		 * address. By default the reference variable will point to null.
		 */
		ObjectReference ord;

		/*
		 * When we create an object using the new key word the memory will be allocated
		 * for this object and the reference variable will point to that particular
		 * memory address.
		 */
		ord = new ObjectReference();
		
		/*
		 * We can access the non-static variables, constructors and methods with the
		 * help of reference variable
		 */
		System.out.println(ord.x);
	}

}
