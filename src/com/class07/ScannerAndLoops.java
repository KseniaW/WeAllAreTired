package com.class07;

import java.util.Scanner;

public class ScannerAndLoops {

	public static void main(String[] args) {

		/*
		 * capture my name 5 times and say hello
		 */
		Scanner scan;
		String name;

		scan = new Scanner(System.in);
		int q = 5;
		while (q <= 10) {

			System.out.println("Please enter your name");
			name = scan.nextLine();
			System.out.println("Hello " + name);
			q++;
		}
	}

}
