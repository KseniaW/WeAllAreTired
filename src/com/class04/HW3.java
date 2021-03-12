package com.class04;

import java.util.Scanner;

public class HW3 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("Please enter your city");
		String city = s.nextLine();
		System.out.println("Please enter temperature in Fahrenheit");
		double tempF = s.nextDouble();

		double tempC = (tempF - 32) * 0.5556;

		System.out.println("The temperature in the city " + city + " is " + tempC + " C");

	}

}
