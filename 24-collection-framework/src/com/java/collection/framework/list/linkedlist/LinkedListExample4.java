package com.java.collection.framework.list.linkedlist;

import java.util.*;

public class LinkedListExample4 {

	public static void main(String[] args) {
		LinkedList<String> ll = new LinkedList<String>();
		ll.add("Ravi");
		ll.add("Vijay");
		ll.add("Ajay");
		// Traversing the list of elements in reverse order
		Iterator<String> i = ll.descendingIterator();
		while (i.hasNext()) {
			System.out.println(i.next());
		}
	}

}
