package com.class08;

public class ContinueKeyWord {

	public static void main(String[] args) {

		for (int i = 1; i <= 10; i++) {
			System.out.println("hello");
			if (i == 3) {
				continue;
			}
			System.out.println("Im inside loop");
		}

        //break-breaks the loop
		// continue--goes back, doesnt go all the way but skips
		
		System.out.println("------------------------------------");
		
		/*
		 * you need to print all numbers from 1 to 10, except 5&6
		 */
		
		for(int i=1;i<=10;i++) {
			
			if(i==5 || i==6) {
				continue;
				
			}
			System.out.print(i+" ");
		}
		System.out.println("------------------------------");
		
		for(int i=1;i<=40;i++) {
			if(i%4==0) {
				continue;
			}
			System.out.print(i+" ");
		}
	}

}
