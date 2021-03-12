package com.class10;

public class Hw {

	public static void main(String[] args) {
		System.out.println("---------Task1------------------------");
		String[] cars = { "BMW", "Lexus", "Toyota", "Honda", "Ford", "Mercedes" };

		for (int i = 0; i < cars.length; i++) {
			System.out.print(cars[i] + " ");
		}
		System.out.println();

		for (String c : cars) {
			System.out.print(c + " ");
		}
		System.out.println();
		System.out.println("--------------Task2-------------------------");

		String[] animals = { "dog", "cat", "lion", "tiger", "panda", "horse" };

		for (int i = 0; i < animals.length; i++) {
			System.out.print(animals[i] + " ");
		}
		System.out.println();
		for (String a : animals) {
			System.out.print(a + " ");
		}
		System.out.println();
		System.out.println("-----------Task3-----------------------------");

		int[] num = { 2, 7, 9, 13, 6, -8 };
		int sum = 0;
		for (int n : num) {
			sum += n;
		}
		System.out.println(sum);
	}

}
