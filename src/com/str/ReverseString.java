package com.str;

public class ReverseString {

	public static String reverseByDefaultMethods(String input) {
		StringBuilder str = new StringBuilder(input);
		str.reverse();
		return str.toString();
	}
	
	public static String reverseByNormalMode(String input) {
		String str = "";
		
		for(int i=input.length()-1;i>=0;i--) {
			str = str+""+input.charAt(i);
		}
		return str;
	}
}
