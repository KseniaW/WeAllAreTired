package com.class07;

public class FoorLoop {

	public static void main(String[] args) {
		// when we know how many times we need to repeat
		//the block of code(i want to say hello 5 times)
		
		//initialization(1)+condition(2)+increment/decrement(3)
		
		for(int i=1; i<=5; i++) {
			System.out.print("Hello ");
		}
		System.out.println();
		
		for(int d=1; d<=50; d++) {
			System.out.print(d+" ");
		}
		System.out.println();
		for(int a=10; a>0; a--) {
			System.out.print(a+" ");
		}
		System.out.println();
		for(int c=0; c<=10; c+=2) {
			System.out.print(c+ " ");
		}
		
		System.out.println();
		for(int i=5; i<=50; i+=5) {
			System.out.print(i+" ");
		}
		System.out.println();
		
	}

}
