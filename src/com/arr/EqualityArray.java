package com.arr;

import java.util.Arrays;

public class EqualityArray {
	public static boolean arrayEquality(int[] arr1,int[] arr2) {
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		return Arrays.equals(arr1, arr2);
	}
}
