package com.arr;

public class Zero {
	public static int[] validate(int[] input) {
		int counter = 0;
		for(int i=0;i<input.length;i++) {
			if(input[i] != 0) {
				input[counter]= input[i];
				counter++;
			}
		}
		while(counter < input.length) {
			input[counter] =0;
			counter++;
		}
		return input;
	}
}
