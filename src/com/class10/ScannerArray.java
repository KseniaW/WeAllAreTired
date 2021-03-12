package com.class10;

import java.util.Scanner;

public class ScannerArray {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
	String[] days=new String[7];
	for(int i=0; i<days.length;i++) {
		System.out.println("Please enter the day");
		days[i]=s.next();
	}
	for(String a:days) {
		System.out.println(a);
	}
		
		
	}

}
