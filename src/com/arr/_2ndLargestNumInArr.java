package com.arr;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class _2ndLargestNumInArr {
	public static int find2ndLarge(int[] arr, int largeSize) {
		List<Integer> data = new ArrayList<>();
		for (int i = 0; i < arr.length; i++) {
			data.add(arr[i]);
		}
		List<Integer> ret = data.stream().sorted().collect(Collectors.toList());
		return ret.get(data.size() - largeSize);
	}

	public static int findLargeDynamic(int[] arr, int position) {
		Arrays.sort(arr);
		return arr[arr.length - position];
	}
}
