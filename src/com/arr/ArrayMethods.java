package com.arr;

import java.util.Arrays;
import java.util.List;
import java.util.Spliterator.OfInt;
import java.util.function.IntConsumer;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ArrayMethods {
	public static void main(String arr[]) {

		int[] input = { 2, 3, 4, 1, 7, 9, 5, 9, 3 };
		int[] input2 = { 4, 6, 8, 9, 2 };

//		List<int[]> asList = Arrays.asList(input); //[2, 3, 4, 1, 7, 9, 5, 9, 3]
//		int binarySearch = Arrays.binarySearch(input, 9); // 7
//		int compare = Arrays.compare(input, input2); // -1 if both content same then 0
//		int compareUnsigned = Arrays.compareUnsigned(input, input2); //-1 contain the same elements in the same order then 0
//		int[] copyOf = Arrays.copyOf(input, 5); //[2, 3, 4, 1, 7]
//		int[] copyOfRange = Arrays.copyOfRange(input, 2, 5); //[4, 1, 7]
//		boolean equals = Arrays.equals(input, input2);
//		Arrays.fill(input, 23); //[23, 23, 23, 23, 23, 23, 23, 23, 23]
//		int hashCode = Arrays.hashCode(input); //707423006 random number
//		int mismatch = Arrays.mismatch(input, input2); //0 if match -1 will get
//		Arrays.parallelPrefix(input, (x,y) -> x - y);//[2, -1, -5, -6, -13, -22, -27, -36, -39]
//		Arrays.parallelSort(input); //[1, 2, 3, 3, 4, 5, 7, 9, 9]
//		Arrays.setAll(input, x -> x -2); //[-2, -1, 0, 1, 2, 3, 4, 5, 6]
//		Arrays.sort(input);
//		OfInt spliterator = Arrays.spliterator(input);
//		spliterator.characteristics();
		IntStream stream = Arrays.stream(input);
//		Arrays.toString(input);

		//System.out.println(Arrays.toString(input));
		//System.out.println(spliterator.characteristics());
	//	stream.forEach();
		System.out.println(stream.sum());
		
	}
}
