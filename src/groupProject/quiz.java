package groupProject;

public class quiz {

	public static void main(String[] args) {
		int[][] a = {
				{1,1,2}, //sum = 4
				{3,1,2}, //sum = 6
				{3,5,3}, //sum = 11
				{0,1,2}  //sum = 3
			};
		
int sum;
for(int r=0; r<a.length; r++) {
	sum=0;
	for(int c=0; c<a[r].length;c++) {
		sum+=a[r][c];
	}
	System.out.println(sum);
}
			
				}
				
			}
			
	
