package com.athensoft.generic.activity6.s3;

/**
 * Activity 18. Unbounded Types Erasure
 * 
 * @author Athens
 *
 */
public class GenericsTester2 {
	public static void main(String[] args) {
		Box integerBox = new Box();
		Box stringBox = new Box();

		integerBox.add(new Integer(10));
		stringBox.add(new String("Hello World"));

		System.out.printf("Integer Value :%d\n", integerBox.get());
		System.out.printf("String Value :%s\n", stringBox.get());

		Integer[] intArray = { 1, 2, 3, 4, 5 };
		printArray(intArray);
	}

	public static <E extends Number> void printArray(E[] inputArray){
        for(E element : inputArray) {
            System.out.printf("%s ", element);
        }

    }

	/*
	public static  void printArray(Number[] inputArray){
		for(Number element : inputArray) {
			System.out.printf("%s ", element);
		}

	}*/


}


