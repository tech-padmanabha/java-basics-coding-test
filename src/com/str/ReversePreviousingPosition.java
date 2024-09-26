package com.str;

import java.util.Iterator;

public class ReversePreviousingPosition {
	
	public static String start(String input) {
		int count = input.length()-1;
		String retStore = "";
		
		
		for(int i=0;i<=input.length()-1;i++) {
			Character c = input.charAt(i);
			Character blanck = ' ';
			if(c.compareTo(blanck) == 0) {
				retStore = retStore+" ";
				continue;
			}
			retStore = retStore+""+input.charAt(count);
			count--;
		}
		
		return retStore;
	}
}
