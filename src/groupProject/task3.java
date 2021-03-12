package groupProject;

public class task3 {

	public static void main(String[] args) {
		int[][] numbers= {
				{1,3,6,7},
				{2,10,4,34},
				{15,8,6,5}
		};
		int sumOdd=0;
		int sumEven=0;
	
		
		for(int r=0; r<numbers.length;r++) {
			for(int c=0; c<numbers[r].length;c++) {
				if(numbers[r][c]%2==0) {
					sumEven+=numbers[r][c];
				}else {
					sumOdd+=numbers[r][c];
				}
			}
		}
System.out.println("The sum of even numbers "+sumEven);
System.out.println("The sum of odd numbers "+sumOdd);

	}

}
