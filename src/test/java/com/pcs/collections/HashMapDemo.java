package com.pcs.collections;

/**
 * Arrays and Lists store elements as ordered collections, with each element given an integer index.
 * HashMap is used for storing data collections as key and value pairs.
 * One object is used as a key (index) to another object (the value).
 *
 * The used below methods are in the HashMap.
 * put --> add values
 * remove --> delete values
 * get --> access values
 *
 * If you try to get a value that is not present in your map, it returns the value of null.
 */
import java.util.HashMap;

import org.testng.annotations.Test;

public class HashMapDemo {
	@Test
	public void func() {

		HashMap<String, Integer> name = new HashMap<String, Integer>();
		name.put("Amy", 154);
		name.put("Dave", 42);
		name.put("Rob", 733);

		System.out.println(name.replace("Dave", 428, 420));
		System.out.println(name.get("Dave"));

		System.out.println("Print the Rob value -->"+name.get("Rob"));
		System.out.println(name.remove("Rob"));
		System.out.println("Printing Rub after remove -->"+name.get("Rob"));
	}
}