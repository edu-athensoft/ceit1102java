package com.athensoft.generic.activity5.s1;

import java.util.*;

/**
 * Activity 13. Upper Bounded Wildcards
 * 
 * @author Athens
 *
 */
public class UpperBoundedWildcards {
	public static double sum(List<? extends Number> numberlist) {
		double sum = 0.0;
		for (Number n : numberlist) sum += n.doubleValue();
		return sum;
	}
	
//	public static double sum2(List<? extends Number> numberlist) {
//		double sum = 0.0;
//		for (Number n : numberlist) sum += n.doubleValue();
//		return sum;
//	}

	public static void main(String args[]) {
		List<Integer> integerList = Arrays.asList(1, 2, 3);
		System.out.println("sum = " + sum(integerList));

		List<Double> doubleList = Arrays.asList(1.2, 2.3, 3.5);
		System.out.println("sum = " + sum(doubleList));
	}
}
