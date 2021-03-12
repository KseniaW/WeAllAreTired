package com.class02;

public class Variables {

	public static void main(String[] args) {

		String name = "Ksenia";
		String lastName = "Brown";
		char grade = 'A';
		String city = "Brooklyn";
		String state = "New York";
		String phoneNumber = "123-456-6778";

		System.out.println("My name is " + name + " and my last name is " + lastName);
		System.out.println("I am " + grade + " student");
		System.out.println("I live in " + city + " " + state);
		System.out.println("And my phone number is " + phoneNumber);

		String newCity = "Virginia Beach";
		String newState = "Virginia";
		String newPhoneNumber = "465-675-7877";

		System.out.println("My name is " + name + " and I moved to " 
		+ newCity + " " + newState
		+ ". My new phone number is " + newPhoneNumber);

	}

}
