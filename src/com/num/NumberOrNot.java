package com.num;

public class NumberOrNot {
	public static boolean validate(String input) {
		try {
			Integer.valueOf(input);
			return true;
		} catch (NumberFormatException e) {
			return false;
		}
	}
}
