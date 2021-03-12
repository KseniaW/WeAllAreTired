package com.class09;

public class Patterns {

	public static void main(String[] args) {

		// outer control rows
		// inner loop controls columns

		for (int r = 1; r < 5; r++) {
			for (int c = 1; c < 6; c++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println("--------------------");

		for (int r = 1; r <= 4; r++) {
			for (int c = 1; c <= 5; c++) {
				System.out.print(c + " ");

			}
			System.out.println();
		}
		for (int r = 1; r <= 5; r++) {
			for (int c = 6; c >= 1; c--) {
				System.out.print(c + " ");
			}
			System.out.println();
		}
		for (int r = 1; r <= 5; r++) {
			for (int c = 5; c >= 1; c--) {
				System.out.print(r + " ");
			}
			System.out.println();
		}
	}
}
