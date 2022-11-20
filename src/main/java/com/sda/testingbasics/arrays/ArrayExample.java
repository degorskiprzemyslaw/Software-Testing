package com.sda.testingbasics.arrays;

import java.util.HashSet;
import java.util.Set;

public class ArrayExample {
	public static String[] removeDuplicates(String[] array) {
		Set<String> elements = new HashSet<>();
	for(String e : array){
		elements.add(e);
	}
	return elements.toArray(new String[0]);

	}
}
