package com.athensoft.generic.activity1.s1;

import java.util.Arrays;

public class MySort {

	public static void main(String[] args) {
		Integer[] numInt = {45,3,56,7,23,6,89,32};
		sortArrayInt(numInt);
		
		Double[] numDouble = {45.1, 3.2, 56.3, 7.4, 23.5, 6.6, 89.7, 32.8};
		sortArrayDouble(numDouble);
		
		sortArray(numInt);
		sortArray(numDouble);
		
	}
	
	private static void sortArrayInt(Integer[] numArray) {
		
		Arrays.sort(numArray);
		
		System.out.println(Arrays.toString(numArray));
	}
	
	private static void sortArrayDouble(Double[] numArray) {
		
		Arrays.sort(numArray);
		
		System.out.println(Arrays.toString(numArray));
	}

	
	public static <T> void sortArray(T[] numArray){
		Arrays.sort(numArray);
		System.out.println(Arrays.toString(numArray));
	}
}
