package com.class11;

import java.util.Scanner;

public class Task {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		double sum=0;
		
		System.out.println("How many elements you want to store");
		int size=s.nextInt();
		
		double[] d=new double[size];
		
		for(int i=0; i<size;i++) {
			System.out.println("Enter double value");
			d[i]=s.nextDouble();
			sum+=d[i];
		}
		System.out.println(sum);
	}

}
