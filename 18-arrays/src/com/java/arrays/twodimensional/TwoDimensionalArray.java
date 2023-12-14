package com.java.arrays.twodimensional;

public class TwoDimensionalArray {

	public static void main(String[] args) {
		/* Creating a two dimensional array */

		int array[][] = new int[3][3];
		array[0][0] = 10;
		array[0][1] = 20;
		array[0][2] = 30;
		array[1][0] = 40;
		array[1][1] = 50;
		array[1][2] = 60;
		array[2][0] = 70;
		array[2][1] = 80;
		array[2][2] = 90;

		/* Accessing a two dimensional array using for loop */
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(array[i][j]+"\t");
			}
			System.out.println();
		}
		
		/*Accessing a two dimensional array using for each loop*/
		for(int k[] : array) {
			for(int l : k) {
				System.out.print(l+"\t");
			}
			System.out.println();
		}
	}

}
