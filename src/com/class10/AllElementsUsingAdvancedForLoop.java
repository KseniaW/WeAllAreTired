package com.class10;

public class AllElementsUsingAdvancedForLoop {

	public static void main(String[] args) {
	
		//for each/enhanced for loop/advanced for loop
		//only with an array and collection
		//only in 1 direction, no reverse, retrieves all the elements
		
		int[] numbers = { 10, 14, 78, 5, 90, 76 };
//what data type and any name:name of array		
		for(int num :numbers) {
			System.out.println(num);
	
		}
		
		String[] names= {"Ksenia","Alina","Katya","Peter","Mehmet",
				"Sumi","Suju","Anastasia"};
		
		for(int i=0; i<names.length; i++) {
			System.out.print(names[i]+" ");
		}
		System.out.println();
		
		for(String a:names) {
			System.out.print(a+" ");
		}
		System.out.println();
		char[] a= {'A','B','C','D','E','F'};
		
		for(char b:a) {
			System.out.print(b+" ");
		}
		System.out.println();
		boolean[] bool= {true,true,true, false};
		for(boolean b:bool) {
			System.out.print(b+" ");
		}
	}

}
