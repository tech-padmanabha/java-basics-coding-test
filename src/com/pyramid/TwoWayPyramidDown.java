package com.pyramid;

public class TwoWayPyramidDown {
	public static void incAndDecNum(int input) {

		int rowCount = 1;
		int printCounter = 1;

		for (int i = input; i > 0; i--) {
			for (int l = 1; l < rowCount; l++) {
				System.out.print("  ");
			}
			for (int j = 0; j < i; j++) {
				System.out.print(printCounter + " ");
				printCounter++;
			}
			printCounter--;
			for (int k = 0; k < i - 1; k++) {
				printCounter--;
				System.out.print(printCounter + " ");
			}
			
			System.out.println();
			rowCount++;
		}
	}
}
