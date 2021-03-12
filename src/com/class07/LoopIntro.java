package com.class07;

public class LoopIntro {

	public static void main(String[] args) {

		System.out.println("Hello");
//execute repetitive code, avoid code redonenecy
		System.out.println("-------------------------------------");
		int time = 17;
		if (time < 12) {
			System.out.println("Hello"); // code executes once
		}
		System.out.println("-----------------------------------------");
		while (time < 12) {
			System.out.println("hello");// code runs forever
			time--;
		}

		int num = 1;
		while (num <= 10) {
			System.out.print(num + " ");
			num++;
		}
		System.out.println();
		num = 20;
		while (num <= 40) {
			System.out.print(num + " ");
			num++;
		}
		System.out.println();
		int a = 10;

		while (a >= 1) {
			System.out.print(a + " ");
			a--;
		}
	}

}
