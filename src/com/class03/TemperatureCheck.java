package com.class03;

public class TemperatureCheck {

	public static void main(String[] args) {

		int temp = 35;
		if (temp < 32) {
			System.out.println("Water will freeze with temperature " + temp);
		} else {
			System.out.println("Water will NOT freze with temperature " + temp);
		}
		System.out.println("------------------------------------------");
		double money = 3;
		double $coke = 3;

		if (money == $coke) {
			System.out.println("Im buying soda");
		} else {
			System.out.println("I need exact amount");
		}
	System.out.println("------------------------------------------");	
		boolean snow=false;
		if(snow) {
			System.out.println("I am going to play with snow");
		}else {
			System.out.println("Im going to ride a bike");
		}
		
		System.out.println("------------------------------");
		
		boolean summer=false;
		if(summer) {
			System.out.println("Im going to Florida");
		}else {
			System.out.println("I will stay at home");
		}
		
	}

}
