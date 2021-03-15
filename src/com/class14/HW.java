package com.class14;

public class HW {

	boolean isPrime(int a) {
		if (a > 1) {
			for (int i = 2; i < a; i++) {
				if (a % i == 0) {
					return false;

				}
			}
		} else {
			return false;
		}

		return true;
	}

	public static void main(String[] args) {

		HW hw = new HW();
		System.out.println(hw.isPrime(10));

	}

}
