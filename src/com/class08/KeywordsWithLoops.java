package com.class08;

public class KeywordsWithLoops {

	public static void main(String[] args) {
		// break
		// continue

		boolean rain = true;
		int temp = 60;

		while (rain) {
			System.out.println("I will stay at home");

			if (temp > 75) {

				System.out.println("I will walk in rain");
				break;
			}

			temp += 2;

		}

		for (int i = 1; i <= 10; i++) {
			System.out.println("hello");

			if (i == 5) {
				break;
			}
			System.out.println("Im inside");
		}

	}
}
