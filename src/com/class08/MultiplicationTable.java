package com.class08;

public class MultiplicationTable {

	public static void main(String[] args) {

		int num = 7;
		int mult;
		
		for (int i = 1; i <= 10; i++) {
			
			mult = num * i;
			System.out.println(num+"*"+i+"="+mult);
		}

	}

}
