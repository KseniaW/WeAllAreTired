package com.class07;

import java.util.Scanner;

public class LotteryDoWhile {

	public static void main(String[] args) {

		/*
		 * 1 to 100 until right number, win number is 17 we need to keep asking until 17
		 * is entered
		 */
		int num;
		int win = 17;
		Scanner s = new Scanner(System.in);

		do {
			System.out.println("Enter the number");
			num = s.nextInt();

		} while (num != win);
		System.out.println("You won");

	}

}
