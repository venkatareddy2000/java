package com.java.nonstaticmembers;

public class CreateObjectInStaticBlock {
	
	//Declaring a global variable
	static CreateObjectInStaticBlock obj1;

	/* Creating a static block*/
	static {
		
		/*Creating a object for the class inside a static block*/
		CreateObjectInStaticBlock obj = new CreateObjectInStaticBlock();
		
		/*Printing the address of the new object created for the class*/
		System.out.println(obj);
		
		System.out.println(obj1);//null value
		
		obj1 = new CreateObjectInStaticBlock();
		System.out.println(obj1);//Will get the address of the obj1
		
	}
	public static void main(String[] args) {

	}

}
