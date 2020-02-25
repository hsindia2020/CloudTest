package com.pcs.collections;

/**
 * A Set is a collection that cannot contain duplicate elements. 
 * It models the mathematical set abstraction.
 * One of the implementations of the Set is the HashSet class.
 * 
 * What is hashing?
 * A hash table stores information through a mechanism called hashing,
 * in which a key's informational content is used to determine a unique value called a hash code.
 * So, basically, each element in the HashSet is associated with its unique hash code.
 */
import java.util.HashSet;
import org.testng.annotations.Test;

public class HashSetDemo {
  @Test
  public void func() {
	  
	  HashSet<String> set = new HashSet<String>();
	    set.add("A");
	    set.add("B");
	    set.add("C");
	    //"B" will be print once.
	    set.add("B");
	    System.out.println(set);
	    System.out.println(set.size());
  }
}
