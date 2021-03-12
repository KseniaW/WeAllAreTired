package com.class09;

public class NestedLoops {

	public static void main(String[] args) {

		for (int i = 1; i < 4; i++) {// outer loop controls inner loop
			for (int j = 1; j < 5; j++) {// inner loop
				System.out.println("good evening");
			}
		}
		System.out.println("------------");

		System.out.println("------------------------------------------");

		for (int i = 5; i < 7; i++) {

			for (int j = 10; j <= 12; j++) {
				System.out.println(i + " " + j);
			}
		}
		System.out.println("----------10 to 99-------------------");
		for (int i = 0; i <= 9; i++) {
			for (int j = 0; j <= 9; j++) {
				System.out.println(i + "" + j);
			}
		}
		System.out.println("----------Car odometer------------------");

		for (int a = 0; a <= 9; a++) {
			for (int b = 0; b <= 9; b++) {
				for (int i = 0; i <= 9; i++) {
					for (int j = 0; j <= 9; j++) {
						System.out.println(a + "" + b + "" + i + "" + j);
					}
				}
			}
		}

		System.out.println("----------Clock------------------");
		for (int a = 0; a <= 23; a++) {
			for (int b = 0; b <= 59; b++) {

				if (b < 10 && a < 10) {

				} else if (a < 10 && b >= 10) {
					System.out.println("0" + a + ":" + b);
				} else if (a >= 10 && b < 10) {
					System.out.println(a + ":0" + b);
				} else {
					System.out.println(a + ":" + b);
				}
			}

		}
		System.out.println("----Nested If Clock-----------------");

		for (int a = 0; a <= 23; a++) {
			for (int b = 0; b <= 59; b++) {
				if (a < 10) {
					if (b < 10) {
						System.out.println("0" + a + ":0" + b);
					} else {
						System.out.println("0" + a + ":" + b);
					}
				} else {
					if (b < 10) {
						System.out.println(a + ":0" + b);
					} else {
						System.out.println(a + ":" + b);
					}

				}
			}
		}
		System.out.println("------------------------------------------------");

		int m;
		for (int j = 1; j <= 9; j++) {
			for (int i = 1; i <= 10; i++) {
				m = j * i;
				System.out.println(j + "*" + i + "=" + m);
			}
			System.out.println("-------");
		}
	}
}

