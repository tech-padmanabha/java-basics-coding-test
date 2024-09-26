package com.num;

public class DecimalToBinary {
	public static int execute(int input) {
		
		String decimalStore = "";
		while(input != 0) {
			int lastDigit = input %2;
			decimalStore = lastDigit +""+decimalStore;
			input = input/2;
		}
		return Integer.parseInt(decimalStore);
	}
	
	//same thing we can do with octal
}
