package com.class06;

import java.util.Scanner;

public class SwitchString {

	public static void main(String[] args) {

		/*
		 * we need to identify favorite food capture the country from a user based on
		 * country identify favorite food
		 */

		Scanner input;
		String country, food;

		input = new Scanner(System.in);
		System.out.println("Please enter your country");
		country = input.nextLine();

		switch (country.toLowerCase()) {
		case "usa":
			food = "burger";
			break;
		case "afghanistan":
			food = "kebab";
			break;
		case "vietnam":
			food = "pho";
			break;
		case "poland":
			food = "pierogi";
			break;
		case "kazakstan":
			food = "horse";
			break;
		case "belarus":
			food = "draniki";
			break;
		case "mexico":
			food = "tacos";
			break;
		default:
			food = "unknown";
			break;
		}
		System.out.println("Your favorite food is "+food);

	}

}
