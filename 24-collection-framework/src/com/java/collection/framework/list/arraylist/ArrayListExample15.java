package com.java.collection.framework.list.arraylist;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListExample15 {

	public static void main(String[] args) {
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		arrayList.add(20);
		arrayList.add(40);
		arrayList.add(10);
		arrayList.add(30);
		System.out.println("Before reversing : " + arrayList);
		Collections.reverse(arrayList);
		System.out.println("After reversing : " + arrayList);
	}

}
