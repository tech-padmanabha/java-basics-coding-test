package com.str;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DuplicateChar {
	public static Map<Character, Integer> duplicates(String input) {
		char[] charArray = input.toLowerCase().toCharArray();

		Map<Character, Integer> charStore = new HashMap<>();

		for (int i = 0; i < charArray.length; i++) {
			char c = charArray[i];
			if (charStore.get(c) != null) {
				charStore.put(c, charStore.get(c) + 1);
			} else {
				charStore.put(c, 1);
			}
		}
		Set<Character> keySet = charStore.keySet();
		Map<Character, Integer> dupData = new HashMap<>();
		for (Character k : keySet) {
			if (charStore.get(k) > 1) {
				dupData.put(k, charStore.get(k));
			}
		}
		return dupData;
	}
}
