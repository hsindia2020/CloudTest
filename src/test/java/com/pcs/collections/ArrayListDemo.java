package com.pcs.collections;

/**
 * For the manipulation of data in different collection types, 
 * the Java API provides a Collections class, which is included in the java.util package.
 * One of the most popular Collections class methods is sort(), [sort start in int = 0 1 2 3 ...]
 * which sorts the elements of your collection type. The methods in the Collections class are static,
 * so you don't need a Collections object to call them.
 * 
 *  */

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Collections;

import org.testng.annotations.BeforeMethod;

public class ArrayListDemo {
  @Test
  public void func() {
	  ArrayList<String> colors = new ArrayList<String>(10);
	  
//	  System.out.println("This is the Array List Exp :"+colors[]);  Not using the array printing style.
	  colors.add("Red");
	  colors.add("Yellow");
	  colors.add("Blue");
	  colors.add("Green");

	  if (colors.contains("Yellow")) {
		  System.out.println("Yellow contains in conditions" +
				  " And the Array List size is "+colors.size());
	  }
	  else {
		  System.out.println("If condition failed");
	  }
	  Collections.sort(colors);
	  
	  /**
	   * Other useful methods in the Collections class:
	   * max(Collection c): Returns the maximum element in c as determined by natural ordering.
	   * min(Collection c): Returns the minimum element in c as determined by natural ordering.
	   * reverse(List list): Reverses the sequence in list.
	   * shuffle(List list): Shuffles (i.e., randomizes) the elements in list.
	   * 
	   */
	  String remcolor = "Green";
	  colors.remove(remcolor);
	  System.out.println("Prints Array List in single and one Args[] Remove "+remcolor+" Colors "+colors+"" +
			  "Now the size is "+colors.size());
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("beforeMethod ** called **");
  }

}
