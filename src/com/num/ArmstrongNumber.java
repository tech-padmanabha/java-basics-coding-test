package com.num;

public class ArmstrongNumber {
	public static boolean isArmStrongNumber(int input) {
		int stored = 0;
		int length = String.valueOf(input).length();
		int tempInput = input;
		while (tempInput != 0) {
			int data = tempInput % 10;
			int tempLength = length;
			int tempStore = 1;
			while (tempLength != 0) {
				tempStore *= data;
				tempLength--;
			}
			stored += tempStore;
			tempInput = tempInput / 10;
		}
		return (input == stored);
	}
	
	public static boolean isArmStrongNumberByMath(int input) {
		int stored = 0;
		int length = String.valueOf(input).length();
		int tempInput = input;
		
		while(tempInput != 0) {
			int digit = tempInput % 10;
			int pow = (int) Math.pow(digit, length);
			stored +=pow;
			tempInput = tempInput/10;
		}
		
		return (stored == input);
	}
	
	//A number is called an Armstrong number if it is equal to sum of its digits each raised to the power of number of digits in it.
	// For example: input 153 = (1*1*1) + (5*5*5) + (3*3*3)  should be same
	// 407
	// 9474
	// 54748
	// 407 i
}
