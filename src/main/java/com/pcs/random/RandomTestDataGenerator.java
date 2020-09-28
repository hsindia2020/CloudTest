package com.pcs.random;

import java.util.Locale;
import java.util.Random;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.github.javafaker.Faker;
import com.google.common.base.Verify;

public class RandomTestDataGenerator {

	@Test
	public void R01() {
		Random ran = new Random();
		/**
		 * Random data use to change the values of int,string,long,double etc.
		 * It will help to do the same.
		 */
		
		String str01 = "First"+ran.nextInt();
		int ii = 29+ran.nextInt();
		long phone = (long)(Math.random()*1000+3568);
		
		System.out.println("Random string "+str01);
		System.out.println("Integer Random number "+ii);
		System.out.println("Long Random "+phone);
		System.out.println("***************************************");
	}
	
	@Test
	public void fak01() {
		
		Locale local = new Locale("en-IND");
		Faker fak = new Faker(local	);
				
		String FN = fak.name().firstName();
		String LN = fak.name().lastName();
		String add = fak.address().buildingNumber();
		String loc = fak.address().cityName();
		String val01 = fak.company().name();
		/**
		 * Faker API use to take the fake data random
		 * All the set of program written in GitHub code
		 */
		
//		Assert.assertNotEquals("Singh", LN);
//		Assert.assertEquals("Harmeet", FN);
		Verify.verify(false, LN, "Sharma");
				
		System.out.println("First name :"+FN);
		System.out.println("Last Name :"+LN);
		System.out.println("Address Building :"+add);
		System.out.println("Compamy Name :"+val01);
		System.out.println("City Name :"+loc); 
	}
	
}
