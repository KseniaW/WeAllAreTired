package com.class08;

import java.util.Scanner;

public class DoWhileReview {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int money;

		System.out.println("Pay for soda");

		do {
			money = s.nextInt();

			if (money < 3) {
				System.out.println("Give more");
			} else if (money > 3) {
				System.out.println("give less");
			}
		} while (money != 3);
		System.out.println("you can have your soda");
	}

}
