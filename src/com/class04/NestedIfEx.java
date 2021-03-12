package com.class04;

public class NestedIfEx {

	public static void main(String[] args) {
		
		int age=18;
		double weight=125;
		
		if (age>=18) {
			System.out.println("You are allowed to donate");
			if(weight>110) {
				System.out.println("Success! you passed all requirements for donation");
			}else {
				System.out.println("Sorry, your weight is not passed the requirement for donation");
			}
		}else {
			System.out.println("Sorry, you cant donate");
		}

	}

}
