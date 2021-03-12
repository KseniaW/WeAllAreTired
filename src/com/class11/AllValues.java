package com.class11;

public class AllValues {

	public static void main(String[] args) {

		String[][] usa = { { "Alexandria", "Oakton", "Arlington", "Virginia Beach", "Fairfax" },
				{ "Philly", "Strassburg", "Pittsburgh" }, { "Boston", "Quincy", "Springfield", "Burligton" },
				{ "Los Angeles", "Long Beach", "San Francisco", "Sacramento", "Santa Barbara" },
				{ "Miami", "Orlando", "Tampa", "Tallahasee" } };
		System.out.println(usa.length);// how many rows --5
		System.out.println(usa[0].length);// 5 elements inside 1st array/ 5 columns in 1st row
		System.out.println(usa[1].length);//3
		System.out.println(usa[2].length);//4
		
		for(int r=0;r<usa.length;r++) {//iterates over rows
			for(int c=0;c<usa[r].length;c++) {
				System.out.print(usa[r][c]+" ");
			}
			System.out.println();
		}
		System.out.println("-----------------------------------------");
		
		for(String[] cities:usa) {
			for(String a:cities) {
				System.out.print(a+" ");
			}
			System.out.println();
		}
	}

}
