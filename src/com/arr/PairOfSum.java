package com.arr;

public class PairOfSum {
	public static void findPairOfSum(int[] arr,int expect) {
		
		for(int i=0;i<arr.length;i++) {
			
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]+arr[j] == expect) {
					System.out.println("("+arr[i]+","+arr[j]+")");
				}
			}
		}
	}
}
