package com.arr;

public class FindNumberInArray {
	public static String findNumber(int[] arr, int num) {
		
		for(int a: arr) {
			if(a==num) {
				return "Yes";
			}
		}
		
		return "No";
	}

	public static void main(String[] args) {
		int[] arr = {2,5,9,8};
		System.out.println(findNumber(arr, 9));
	}
	
}
