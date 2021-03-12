package com.class07;

public class Task1 {

	public static void main(String[] args) {

		for (int i = 1; i <= 100; i++) {
			System.out.print(i + " ");
		}
		System.out.println();
		for (int i = 100; i >= 1; i--) {
			System.out.print(i + " ");
		}
		System.out.println();

		for (int i = 20; i >= 1; i -= 2) {
			System.out.print(i + " ");
		}

		System.out.println();
		for (int i = 20; i >= 1; i--) {
			if (i % 2 == 0) {
				System.out.print(i + " ");
			}
		}
		System.out.println();

		for (int i = 21; i < 50; i += 2) {
			System.out.print(i + " ");
		}
		System.out.println();
		for (int i = 20; i <= 50; i++) {
			if (i % 2 != 0) {
				System.out.print(i + " ");
			}
		}
		System.out.println();
		int sum = 0;
		for (int i = 1; i <= 5; i++) {// 15
			sum = sum + i;
		}
		System.out.println(sum);

		int result = 0;
		for (int i = 2; i < 10; i += 2) {// 2,6,12,20
			result += i;// result=result+1
			System.out.print(result + " ");
		}

	}

}
