package com.class11;

public class Task1 {

	public static void main(String[] args) {
		
		String [][] names= {
				{"Mr","Mrs","Ms","Miss"},
				{"Smith","Jordan","Jackson","Obama"}
		};
	System.out.println(names[0][1]+" "+names[1][0]);
	System.out.println(names[0][0]+" "+names[1][3]);
	System.out.println(names[0][2]+" "+names[1][2]);
	System.out.println(names[0][3]+" "+names[1][1]);
	
	
	String[][] grades= {
			{"Jack","Nick","Olga","Lena"},
			{"A","B","C","D"}
	};
	
	System.out.println(grades[0][0]+" "+grades[1][0]);
	System.out.println(grades[0][1]+" "+grades[1][1]);


	}

}
