package groupProject;

public class task2 {

	public static void main(String[] args) {
		
		int[][] numbers= {
				{2,14,3,7},
				{3,12,5,8},
				{1,5,10,13}
		};
		 
		for(int r=0; r<numbers.length;r++) {
			for(int c=0; c<numbers[r].length; c++) {
				if(numbers[r][c]%2==0) {
					System.out.print(numbers[r][c]+" ");
					
				}
			}
		}
		System.out.println();
		System.out.println("------------------------------");
		for(int[]nums: numbers) {
			for(int n:nums) {
				if(n%2==0) {
					System.out.print(n+" ");
				}
			}
		}

	}

}
