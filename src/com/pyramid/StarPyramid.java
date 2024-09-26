package com.pyramid;

public class StarPyramid {
	public static void printPyramid(int input) {

		int rowCount = 1;
		for (int i = input; i > 0; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= rowCount; j++) {
				System.out.print("* ");
			}
			System.out.println();
			rowCount++;
		}
	}
}
