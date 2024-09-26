package com.num;

public class BinaryCheck {
	public static boolean validate(int input) {
		boolean flag = true;
		while (input != 0) {
			int readLast = input % 10;
			if (readLast > 1) {
				flag = false;
				break;
			}
			input /= 10;
		}
		return flag;
	}
}
