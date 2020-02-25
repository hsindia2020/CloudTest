package com.pcs.collections;

/**
 * LinkedList VS ArrayList
 * The most notable difference between the LinkedList and the ArrayList is in the way they store objects.
 * The ArrayList is better for storing and accessing data, as it is very similar to a normal array.
 * The LinkedList is better for manipulating data, such as making numerous inserts and deletes.
 * 
 * In addition to storing the object, the LinkedList stores the memory address 
 * (or link) of the element that follows it. 
 * It's called a LinkedList because each element contains a link to the neighboring element.
 * 
 * - Use an ArrayList when you need rapid access to your data.
 * - Use a LinkedList when you need to make a large number of inserts and/or deletes.
 */
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedList1 { 
	public static void main(String args[]){  

		Integer obj = new Integer(5);
		
		LinkedList<String> al=new LinkedList<String>();  
		al.add("Ravi");  
		al.add("Vijay");  
		al.add("Ravi");  
		al.add("Ajay");  

		/**
		 * An Iterator is an object that enables to cycle through a collection, 
		 * obtain or remove elements. Before you can access a collection through an iterator, 
		 * you must obtain one. Each of the collection classes provides an iterator() method that returns an iterator
		 * to the start of the collection. By using this iterator object,
		 * you can access each element in the collection, one element at a time.
		 * 
		 * The Iterator class provides the following methods:
		 * hasNext(): Returns true if there is at least one more element; otherwise, it returns false.
		 * next(): Returns the next object and advances the iterator.
		 * remove(): Removes the last object that was returned by next from the collection.
		 * 
		 */
		Iterator<String> itr=al.iterator();  
		
		/**
		 * t.next() returns the first element in the list and then moves the iterator on to the next element.
		 * Each time you call it.next(), the iterator moves to the next element of the list.
		 */
		while(itr.hasNext()){  
			System.out.println(itr.next());  
		}  
	}  
}
