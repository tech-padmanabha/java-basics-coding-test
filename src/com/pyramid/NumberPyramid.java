package com.pyramid;

public class NumberPyramid {
	public static void linePyramid(int input) {
		int count = 1;

		for (int i = input; i > 0; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= count; j++) {
				System.out.print(count + " ");
			}
			System.out.println();
			count++;
		}

	}
	
	public static void crossLinePyramid(int input) {
		int count = 1;
		int numCount = 1;
		for(int i=input;i>0;i--) {
			for(int j=1;j<=i;j++) {
				System.out.print(" ");
			}
			for(int k=1;k<=count;k++) {
				System.out.print(numCount+" ");
				numCount++;
			}
			System.out.println();
			numCount=1;
			count++;
		}
	}
}
