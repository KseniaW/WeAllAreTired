package com.class10;

public class Task {

	public static void main(String[] args) {
		
		String[] names= {"Ksenia","Alina","Katya","Peter","Mehmet",
				"Sumi","Suju","Anastasia"};
		System.out.println(names[0]);
		
		String[] n=new String[8];
		n[0]="Ksenia";
		n[1]="Alina";
		n[2]="Katya";
		n[3]="Peter";
		n[4]="Mehmet";
		n[5]="Sumi";
		n[6]="Suju";
		n[7]="Anastasia";
		
		System.out.println(n[0]);
		System.out.println("-----------------------------------");
		for(int i=0; i<n.length;i++) {
			System.out.println(n[i]);
		}
		for(String a:n) {
			System.out.print(a+" ");
		}

	}

}
