package com.class08;

import java.util.Scanner;

public class Task4 {
	
	/*
	 * Write a program to ask a user to enter item they want 
	 * to buy and the price of that item. 
	 * Every time user enters money, accumulate the amount and 
	 * tell the user how much is left to pay off. 
	 * If user give more money program should return a change. 
	 * Whenever a user done with payments program should say
	 *  “Thank you for shopping!”
	 */

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String item;
		double price,money;

		System.out.println("Enter the item you want to buy");
		item = s.nextLine();
		
		System.out.println("Whats the price of "+item);
		price = s.nextDouble();
		
		System.out.println("Enter the money for "+item);
		money=s.nextDouble();
		
		while(money!=price) {
			if(money>price) {
				System.out.println("take your change "+(money-price));
				break;
			}else if(money<price){
				System.out.println("You need to pay more");
				System.out.println("Enter the money");
				money=s.nextDouble();	
				
			}
		
		}
		System.out.println("thank you for shopping");
		
	}

}
