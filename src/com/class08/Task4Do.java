package com.class08;

import java.util.Scanner;

public class Task4Do {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String item;
		double price, money, sum = 0, remain;

		System.out.println("Enter the item you want to buy");
		item = s.nextLine();

		System.out.println("Whats the price of " + item);
		price = s.nextDouble();

		do {
			money = s.nextDouble();
			sum += money;

			if (sum < price) {

				remain = price - sum;
				System.out.println("enter " + remain);

			} else if (sum > price) {
				remain = sum - price;
				System.out.println("take the change " + remain);
				break;
			} else {
				System.out.println("you got the right amount.");
			}
		} while (price != sum);
		System.out.println("Thank you for shopping");
	}

}
