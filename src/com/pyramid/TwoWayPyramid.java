package com.pyramid;

public class TwoWayPyramid {
	public static void incAndDecNum(int input) {

		int rowCount = 1;
		int printCounter = 1;

		for (int i = input; i > 0; i--) {
			for(int j=1; j<=i ;j++) {
				System.out.print("  ");
			}
			for(int k=1;k<=rowCount;k++) {
				System.out.print(printCounter+" ");
				printCounter++;
			}
			printCounter--;
			for(int l=2;l<=rowCount;l++) {
				printCounter--;
				System.out.print(printCounter+" ");
			}
			System.out.println();
			printCounter=1;
			rowCount++;
		}
	}
}
