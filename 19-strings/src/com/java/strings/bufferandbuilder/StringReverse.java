package com.java.strings.bufferandbuilder;

public class StringReverse {

	public String reverse(String name) {
		String reverse = "";
		for (int i = name.length(); i > 0; i--) {
			reverse = reverse + name.charAt(i - 1);
		}
		return reverse;

	}

	public static void main(String[] args) {
		StringReverse stringReverse = new StringReverse();
		String reverseString = stringReverse.reverse("venky");
		System.out.println(reverseString);

	}

}
