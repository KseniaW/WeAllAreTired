package com.class04;

import java.util.Scanner;

public class HW1 {

	public static void main(String[] args) {

		Scanner s=new Scanner(System.in);
		System.out.println("Please enter the amount of loan needed");
		double loan=s.nextDouble();
		if(loan<=200000) {
			System.out.println("Congrats! Your loan is approved");
		}else {
			System.out.println("Sorry, your loan cannot be approved because the amount is too big");
		}
		
		
	}

}
