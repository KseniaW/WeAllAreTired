package com.class08;

import java.util.Scanner;

public class Task2 {

	/*
	 * Create a program that will keep asking user to apply for a credit card. As
	 * soon you get “yes” from a user program should stop asking.
	 * 
	 */

	public static void main(String[] args) {
		String card;
		Scanner s = new Scanner(System.in);

		System.out.println("Would you like to apply for cc?");
		card = s.next();

		while (!card.equalsIgnoreCase("yes")) {
			System.out.println("Would you like to apply for cc?");
			card = s.next();
		}
		System.out.println("you got it");
	}

}
