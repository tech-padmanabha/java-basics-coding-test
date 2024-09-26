package com.str;

public class PercentageOfData {

	public static void validate(String input) {
		int upperCase=0,lowerCase=0,digits=0,others=0;
		char[] charArray = input.toCharArray();
		
		for(int i=0;i<charArray.length;i++) {
			if(Character.isUpperCase(charArray[i])) {
				upperCase++;
			}else if(Character.isLowerCase(charArray[i])) {
				lowerCase++;
			}else if(Character.isDigit(charArray[i])) {
				digits++;
			}else {
				others++;
			}
		}
		
		System.out.println(" UPPER LETTERS :"+getPercentage(upperCase, input.length())+"%");
		System.out.println(" lower letters :"+getPercentage(lowerCase, input.length())+"%");
		System.out.println(" Digits 	   :"+getPercentage(digits, input.length())+"%");
		System.out.println("Special Chars  :"+getPercentage(others, input.length())+"%");
	}
	
	private static double getPercentage(int word,int total) {
		return (word * 100 )/total;
	}
}
