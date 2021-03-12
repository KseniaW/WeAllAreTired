package groupProject;

public class task4 {

	public static void main(String[] args) {
		String[][] countries= {
				{"Canada","USA","Mexico"},
				{"Brazil","Colombia","Peru","Argentina"},
				{"Finland","Sweeden","England","Italy","France"},
				{"Japan","Indonesia","China"},
				{"Nigeria","Ghana","Kenya","Ethiopia"}
		};
		int total=0;
		
	for(String[] count:countries) {
		for(String c:count) {
			System.out.print(c+" ");
		}
		System.out.println();
	}
	System.out.println();
	
	System.out.println("----------Second way-------------------------");
	
	for(int r=0; r<countries.length; r++) {
		total+=countries[r].length;
		for(int c=0; c<countries[r].length; c++) {
			System.out.print(countries[r][c]+" ");
		}
		System.out.println();
	}
	System.out.println();
	System.out.println("Total coutries have been stored "+total);
	
	}

}
