package com.java.abstraction.assignment;

public class Test {

	public static void main(String[] args) {
		TouchScreenLaptop hpNoteBook = new HPNoteBook();
		TouchScreenLaptop dellNoteBook = new DellNoteBook();
		hpNoteBook.scroll();
		hpNoteBook.click();
		dellNoteBook.scroll();
		dellNoteBook.click();
	}

}
