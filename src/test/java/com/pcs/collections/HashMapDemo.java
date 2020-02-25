package com.pcs.collections;

/**
 * Arrays and Lists store elements as ordered collections, with each element given an integer index.
 * HashMap is used for storing data collections as key and value pairs. 
 * One object is used as a key (index) to another object (the value).
 * 
 * The put, remove, and get methods are used to add, delete, and access values in the HashMap.
 * 
 * If you try to get a value that is not present in your map, it returns the value of null.
 */
import java.util.HashMap;

import org.testng.annotations.Test;

public class HashMapDemo {
	@Test
	public void func() {

		HashMap<String, Integer> points = new HashMap<String, Integer>();
		points.put("Amy", 154);
		points.put("Dave", 42);
		points.put("Rob", 733);
		
		System.out.println(points.replace("Dave", 42, 40));
		System.out.println(points.get("Dave")); 

	}
}