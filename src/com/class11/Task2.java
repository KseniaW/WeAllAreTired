package com.class11;

public class Task2 {

	public static void main(String[] args) {
	String[][] cars={
		{"Ford","Jeep","Tesla"},
		{"BMW","Audi"},
		{"Kia","Hyundai","Chevrolet"},
		{"Lambo","Alfa Romeo"}
	};
	
	for(String[]car:cars) {
		for(String c:car) {
			System.out.print(c+" ");
		}
		System.out.println();
	}
	System.out.println("---------------------------------------");
	
	for(int r=0;r<cars.length;r++) {
		for(int c=0; c<cars[r].length;c++) {
			System.out.print(cars[r][c]+" ");
		}
		System.out.println();
	}
	
	System.out.println("--------------------Grocery List---------------------------");
	
	String[][]groceries={
		{"cabbage","potatoes","carrots"},
		{"apple","pineapple","orange","kiwi"},
		{"milk","yogurt"},
		{"cake","cookie","candy"}
	};
	
	for(String[] a:groceries) {
		for(String b:a) {
			System.out.print(b+" ");
		}
		System.out.println();
	}
	System.out.println("----------------------------------------");
	
	for(int r=0; r<groceries.length;r++) {
		for(int c=0; c<groceries[r].length;c++) {
			System.out.print(groceries[r][c]+" ");
		}
		System.out.println();
	}

	}

}
