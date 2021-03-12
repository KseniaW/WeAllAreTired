package groupProject;

public class task1 {

	public static void main(String[] args) {
		int[][] numbers = { { 10, 2, 30 }, { 4, 50, 6 }, { 7, 8, 99 } };
		int sum = 0;

		for(int r=0; r<numbers.length;r++) {
			for(int c=0; c<numbers[r].length; c++) {
				sum+=numbers[r][c];
			}
			
		}

		System.out.println(sum);
		System.out.println("---------------------------");
		
		int s=0;
		for(int[]num:numbers) {
			for(int n:num) {
				s+=n;
			}
		}
		System.out.println(s);
	}

}
