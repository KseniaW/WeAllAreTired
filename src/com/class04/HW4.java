package com.class04;

import java.util.Scanner;

public class HW4 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("Do you have a credit card? True/False");
		boolean card = s.nextBoolean();
		if (card) {
			System.out.println("What is the balance on the card?");
			double balance = s.nextDouble();
			if (balance > 1000) {
				System.out.println("You need to pay off immediately");
			} else {
				System.out.println("You have enough funds. You can spend more");
			}
		} else {
			System.out.println("You need to apply for a credit card");
		}

	}

}
