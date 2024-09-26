package com.str;

public class ReverseWords {

	public static String reverseEach(String input) {
		String[] split = input.split("\s");
		String ret = "";
		for(String s: split) {
			String tempStore = "";
			for(int i=s.length()-1;i>=0;i--) {
				tempStore = tempStore+""+s.charAt(i);
			}
			ret = ret+""+tempStore+" ";			
		}
		return ret;
	}
}
