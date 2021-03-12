package com.class06;

public class SwitchExample {

	public static void main(String[] args) {
	
/*
 * store gender using M or F
 * based on gender we will specify
 * if M-->male
 * if F-->female
 * otherwise-->not sure
 * 
 * /*
		 * LIMITATIONS:
		 * cant use with boolean
		 * cant use with double value
		 * inside switch cant use ><= relational or logical && || operators
		 */
		
 
		
		char gender='F';
		String description;
		
		switch(gender) {
		case 'M':
			description="Male";
			break;
		case 'F':
			description="Female";
			break;
			default:
				description="N/A";
			break;
			}
		System.out.println(description);
		
		boolean sunny=true;
		if(sunny) {
			System.out.println("I am happy");
		}
		
	
	}
}
