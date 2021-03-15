package com.class14;

public class HW1 {

	static void hello(String country) {
		switch(country){
			case "USA":
				System.out.println("hello");
				break;
			case "Spain":
				System.out.println("hola");
				break;
			case "Turkey":
				System.out.println("merhaba");
				break;
				default:
					System.out.println("Unknown");
		}
		
	}

	public static void main(String[] args) {
hello("Spain");

	}

}
