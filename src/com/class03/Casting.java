package com.class03;

public class Casting {

	public static void main(String[] args) {
		
	//int i=10.99; type mismatch
		//widening(implicit casting)
		double d=10;
		System.out.println(d);
		
		/*
		 * Casting
		 * converting a data type to another
		 * 
		 * 2 types:
		 * 
		 * widening(implicit)
		 * byte--short--int--long--float--double (automatically)
		 * narrowing(explicit)
		 * double--float--long--int--short--byte(manually)
		 * 
		 * 
		 */
		//explicit casting(narrowing)
		int i=(int)12.99;
		System.out.println(i);
		
		byte b=(byte)130;
		System.out.println(b);
		
		int number=12;
	double result=number/5;
	System.out.println(result);
	
	double newNum=10;
	newNum/=3;
	System.out.println(newNum);//3.33333333
		
		
		
		
		
		
		

	}

}
