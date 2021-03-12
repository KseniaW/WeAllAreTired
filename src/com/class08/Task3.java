package com.class08;

import java.util.Scanner;

public class Task3 {
	/*
	 * Write a program that reads a range of integers 
	 * (start and end point), provided by a user and 
	 * then from that range prints the sum of the even 
	 * and odd integers.
	 */

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int start, end, sumEven = 0, sumOdd = 0;

		System.out.println("Please enter 2 int");
		start = s.nextInt();
		end = s.nextInt();

	while (start > end || start==end) {
			System.out.println("Please enter 2 int");
			start = s.nextInt();
			end = s.nextInt();
		}
		for (int i = start; i <= end; i++) {
			if (i % 2 == 0) {
				sumEven += i;
			} else {
				sumOdd += i;
			}
		}
		System.out.print(sumEven + " ");
		System.out.println(sumOdd + " ");
	}

}
