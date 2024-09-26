package com.str;

import java.util.Arrays;

public class Anagram {
	public static boolean isAnagram(String input, String match) {

		char[] inputArr = input.replaceAll("\s", "").toLowerCase().toCharArray();
		char[] matchArr = match.replaceAll("\s", "").toLowerCase().toCharArray();

		Arrays.sort(inputArr);
		Arrays.sort(matchArr);

		return Arrays.equals(inputArr, matchArr);
	}
	/*
	Test It
	"Mother In Law", "Hitler Woman"
	"School MASTER", "The ClassROOM"
	"Debit Card", "Bad Credit"
	*/
}
