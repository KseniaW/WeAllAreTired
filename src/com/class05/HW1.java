package com.class05;

import java.util.Scanner;

public class HW1 {

	public static void main(String[] args) {
		String birthMonth;
		String season;

		Scanner s = new Scanner(System.in);
		System.out.println("Please enter your birth month");
		birthMonth = s.nextLine();

		if (birthMonth.equalsIgnoreCase("January") || birthMonth.equalsIgnoreCase("February") || birthMonth.equalsIgnoreCase("December")) {
			season = "winter";
		} else if (birthMonth.equalsIgnoreCase("March") || birthMonth.equalsIgnoreCase("April") || birthMonth.equalsIgnoreCase("May")) {
			season = "spring";
		} else if (birthMonth.equalsIgnoreCase("June") || birthMonth.equalsIgnoreCase("July") || birthMonth.equalsIgnoreCase("August")) {
			season = "summer";
		} else if (birthMonth.equalsIgnoreCase("September") || birthMonth.equalsIgnoreCase("October") || birthMonth.equalsIgnoreCase("November")) {
			season = "fall";
		} else {
			season="Invalid month was provided";
		}
		System.out.println("You were born in " + season);

	}

}
