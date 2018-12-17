package com.athensoft.generic.activity5.s2;

import java.util.Arrays;
import java.util.List;

/**
 * Activity 14. Unbounded Wildcard
 * 
 * @author Athens
 *
 */
public class UnboundedWildcards {
	public static void printAll(List<?> list) {
		for (Object item : list)
			System.out.println(item + " ");	//type independent
	}

	public static void main(String args[]) {
		List<Integer> integerList = Arrays.asList(1, 2, 3);
		printAll(integerList);
		List<Double> doubleList = Arrays.asList(1.2, 2.3, 3.5);
		printAll(doubleList);
	}
}
