package com.num;

import java.util.stream.Stream;

public class SumAllDigit {
	public static int sum(int input) {
		int sumDigits = 0;
		
		while(input != 0) {
			int digit = input%10;
			sumDigits+=digit;
			input = input/10;
		}
		return sumDigits;
	}
	
	public static int sumOfAll(int input) {
		int sum = Stream.of(String.valueOf(input).split("")).mapToInt(Integer::parseInt).sum();
		return sum;
	}
}
