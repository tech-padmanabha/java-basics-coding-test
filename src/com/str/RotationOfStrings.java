package com.str;

import java.util.Arrays;

public class RotationOfStrings {
	public static boolean validate(String input,String checked) {
		
		char[] inputArray = input.toCharArray();
		char[] checkedArray = checked.toCharArray();
		
		Arrays.sort(inputArray);
		Arrays.sort(checkedArray);
		
		return Arrays.equals(inputArray, checkedArray);
	}
	
	//String input = "JavaJ2eeStrutsHibernate";
	
	//String check = "StrutsHibernateJavaJ2ee";
	//String check = "J2eeStrutsHibernateJava";
	//String check = "HibernateJavaJ2eeStruts";
}
