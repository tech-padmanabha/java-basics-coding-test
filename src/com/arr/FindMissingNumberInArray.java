package com.arr;

public class FindMissingNumberInArray {

	public static int find(int[] arr,int input) {

		int total = (input * (input + 1)) / 2;
		int tempCompare = 0;
		for(int i=0 ; i< arr.length;i++) {
			tempCompare+=arr[i];
		}
		return total- tempCompare;
	}

}
