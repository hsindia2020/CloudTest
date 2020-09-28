package com.pcs.random;

import io.codearte.jfairy.Fairy;
import io.codearte.jfairy.producer.person.Person;

public class jfairyDemo {

	public static void main(String args[]) {
		
		Fairy fairycreate = Fairy.create();
		
		Person person = fairycreate.person();
		
		String firstname = person.getFirstName();
		String lastname = person.getLastName();
		String address = person.getAddress().getStreet();
		String phonenumber = person.getTelephoneNumber();
		String email = person.getEmail();
		
		String pass = person.getPassword();
		
		System.out.println("First Name :"+firstname);
		System.out.println("Last Name :"+lastname);
		System.out.println("Address :"+address);
		System.out.println("Phone Number :"+phonenumber);
		System.out.println("Email :"+email);
		System.out.println("Password :"+pass);
		
	}
}
