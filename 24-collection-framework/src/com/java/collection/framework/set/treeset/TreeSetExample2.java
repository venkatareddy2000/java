package com.java.collection.framework.set.treeset;

import java.util.*;

public class TreeSetExample2 {

	public static void main(String[] args) {
		TreeSet<String> set = new TreeSet<String>();
		set.add("Ravi");
		set.add("Vijay");
		set.add("Ajay");
		System.out.println("Traversing element through Iterator in descending order");
		Iterator<String> i = set.descendingIterator();
		while (i.hasNext()) {
			System.out.println(i.next());
		}
	}

}
