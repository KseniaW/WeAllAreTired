package com.class05;

public class LogicalAnd {

	public static void main(String[] args) {
		/*
		 * we have to identify if number is small, medium, large,xlarge
		 * if number between 1 and 10-->small
		 * if number between 11 and 100-->medium
		 * if number between 101 and 1000-->large
		 * if number between 1001 till 100000-->xlarge
		 */

		int num=100;
		
		if(num>=1 && num<=10) {
			System.out.println("The number is small");
		}else if(num>=11 && num<=100) {
			System.out.println("The number is medium");
		}else if(num>=101 && num<=1000) {
			System.out.println("The number is large");
		}else if(num>=1001 && num<=100000) {
			System.out.println("The number is xlarge");
		}
		}
	}


