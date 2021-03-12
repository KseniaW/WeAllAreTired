package groupProject;

public class task6 {

	public static void main(String[] args) {
		int num=-19;
		boolean prime=true;
		if(num>1) {
		
		for(int i=2; i<num; i++) {
			if(num%i==0) {
				prime=false;
				break;
				
			}
		}
		}else {
			
			prime=false;
		}
		if(prime) {
			System.out.println(num+" is a prime number");
		}else {
			System.out.println(num+" is NOT a prime number");
		}
		
		
		
		
		
		
		

	}

}
