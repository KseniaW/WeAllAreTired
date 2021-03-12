package com.class06;

import java.util.Scanner;

public class Example {

	public static void main(String[] args) {
	
		/*
		 * we need to calculate the price after the discount
		 * we check if there is sale
		 * 
		 * if no sale--Im not going for shopping
		 * 
		 * if there is sale:
		 * we will ask the item
		 * we will ask the price
		 * if price is less than 10--apply 5% discount
		 * if price is between 10 and 100--we apply 10% discount
		 * if price is between 100 and 500--we apply 20% disc
		 * if price is more than 500--apply 30% discount
		 */

		boolean sale=true;
		
		Scanner s=new Scanner(System.in);
		
		String item;
		double price,discount = 0,finalPrice = 0;
		
		System.out.println("Is there a sale");
		sale=s.nextBoolean();
		
		if(!sale) {
			System.out.println("I am not going for shopping");
		}else {
			System.out.println("what item are you buying");
			 item=s.next();
			 System.out.println("what is the price of the item");
			 price=s.nextDouble();
			 
			 if(price<=10) {
				 discount=price*0.05;
			 }else if(price>10 && price<100) {
				 discount=price*0.1;
			 }else if(price>=100 && price<=500) {
				 discount=price*0.2;
			 }else if(price>500) {
				 discount=price*0.3;
			 }
			 finalPrice=price-discount;
			 System.out.println("The final price of the item "+item+" is "+finalPrice+" with a discount "+discount);
		}
		
	}

}
