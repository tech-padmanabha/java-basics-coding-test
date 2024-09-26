package com.arr;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class IntersectionOfTwoArr {
	public static int[] intersection(int[] arr, int[] arr2) {
		Set<Integer> retStore = new HashSet<>();
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr2.length; j++) {
				if (arr[i] == arr2[j]) {
					retStore.add(arr[i]);
				}
			}
		}
		return retStore.stream().mapToInt(x -> x.intValue()).toArray();
	}
	
	public static int[] intersectionDefalt(int[] arr,int[] arr2) {
		
		Set<Integer> a = Arrays.stream(arr).boxed().collect(Collectors.toSet());
		Set<Integer> b = Arrays.stream(arr2).boxed().collect(Collectors.toSet());
		a.retainAll(b);
		// return a.stream().mapToInt(x -> x.intValue()).toArray(); // method call
		 return a.stream().mapToInt(Integer::intValue).toArray();	// method ref
	}
}
