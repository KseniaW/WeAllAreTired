package com.class07;

import java.util.Scanner;

public class LotteryWhile {

	public static void main(String[] args) {
		int num;
		int win = 17;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number");
		num = s.nextInt();

		while (num != win) {
			System.out.println("Enter the number");
			num = s.nextInt();
		}

		System.out.println("you won");

		//we dont know how many time we need to repeat 
		//the block of code we use while or do while
	}

}
