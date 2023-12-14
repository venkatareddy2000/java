package com.java.collection.framework.list.arraylist;

import java.util.*;

public class ArrayListExample12 {

	public static void main(String[] args) {

		/*
		 * Size represents the number of elements present in the list and the capacity
		 * represents the number of elements it can store.
		 */
		ArrayList<Integer> al = new ArrayList<Integer>();

		System.out.println("The size of the array is: " + al.size());

		ArrayList<Integer> al1 = new ArrayList<Integer>(10);

		System.out.println("The size of the array is: " + al1.size());
	}

}
