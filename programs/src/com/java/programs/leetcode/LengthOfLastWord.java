/*58. Length of Last Word*/
package com.java.programs.leetcode;

public class LengthOfLastWord {
	public int lengthOfLastWord(String s) {
		String[] words = s.split(" ");
		int sizeOfWords = words.length;
		int lengthOfWord = words[sizeOfWords-1].length();
		return lengthOfWord;
	}

	public static void main(String[] args) {
		LengthOfLastWord lastWord = new LengthOfLastWord();
		String string = new String("Hello Welcome to the Java World");
		int result = lastWord.lengthOfLastWord(string);
		System.out.println("The length of the last word is : " + result);
	}

}
