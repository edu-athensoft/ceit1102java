package com.athensoft.generic.activity4.s3;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Activity 12. Map
 * 
 * @author Athens
 *
 */
public class GenericMap {
	public static void main(String[] args) {

		Map<Integer, Integer> integerMap = new HashMap<Integer, Integer>();

		integerMap.put(1, 10);
		integerMap.put(2, 11);

		Map<String, String> stringMap = new HashMap<String, String>();

		stringMap.put("1", "Hello World");
		stringMap.put("2", "Hi World");

		System.out.printf("Integer Value :%d\n", integerMap.get(1));
		System.out.printf("String Value :%s\n", stringMap.get("1"));

		// iterate keys.
		Iterator<Integer> integerIterator = integerMap.keySet().iterator();

		while (integerIterator.hasNext()) {
			System.out.printf("Integer Value :%d\n", integerIterator.next());
		}

		// iterate values.
		Iterator<String> stringIterator = stringMap.values().iterator();

		while (stringIterator.hasNext()) {
			System.out.printf("String Value :%s\n", stringIterator.next());
		}
		
		
		// traverse map
//		Map<String, String> stringMap = new HashMap<String, String>();
		 
		for (Map.Entry<String, String> entry : stringMap.entrySet()) {
		 
		    System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
		 
		}

	}
}
