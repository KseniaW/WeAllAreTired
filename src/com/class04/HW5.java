package com.class04;

import java.util.Scanner;

public class HW5 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("Please enter the number of worked years");
		int years = s.nextInt();
		System.out.println("PLease enter annual salary");
		double salary = s.nextDouble();

		if(years>=5) {
			System.out.println("Congrats! You are eligible for a bonus");
		if(salary>50000) {
			System.out.println("Your bonus is 5000");
		}else {
			System.out.println("Your bonus is 3000");
		}
		}else {
			System.out.println("Sorry you are not eligible for a bonus");
		}
	}

}
