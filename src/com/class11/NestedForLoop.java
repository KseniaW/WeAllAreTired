package com.class11;

public class NestedForLoop {

	public static void main(String[] args) {
		
		int[][]numbers= {
				{10,20,30,40},
				{90,80},
				{1,2,3,4,5,6,7}
		};
		System.out.println(numbers.length);//rows--3
		System.out.println(numbers[1].length);//numbers of 2nd array

		
		for(int r=0;r<numbers.length;r++) {
			for(int c=0;c<numbers[r].length;c++) {
				System.out.print(numbers[r][c]+" ");
			}
			System.out.println();
		}
		
		System.out.println("----------------------------------------");
	for(int[] b:numbers) {
		for(int a:b) {
			System.out.print(a+" ");
		}
		System.out.println();
	}
	}

}
