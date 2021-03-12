package com.class04;

public class Task2 {

	public static void main(String[] args) {

		double rate = 4;
		double price = 100000;

		if (rate > 4.5) {
			System.out.println("You will not buy a house");
		} else {
			System.out.println("You will consider buying");
			if (price > 200000) {
				System.out.println("You need a loan");
			} else {
				System.out.println("You can pay cash");
			}
		}

	}

}
