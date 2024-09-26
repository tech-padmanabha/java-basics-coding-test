package com.collection;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class RemoveDuplicate {
	public static List<String> remove(List<String> intList){
		Set<String> collect = intList.stream().collect(Collectors.toSet());
		return collect.stream().collect(Collectors.toList());
	}
}
