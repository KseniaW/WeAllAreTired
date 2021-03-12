package groupProject;

public class task7 {

	public static void main(String[] args) {

		int a = 0;
		int b = 1;
		int c;
		
		for(int i=1; i<=10;i++) {
			System.out.print(a+" ");
			
			c=a+b;
			
			a=b;
			b=c;
			
			
		}
		System.out.println();
		System.out.println("------------------------");
		
		int f1=0;
		int f2=1;
			for(int f=1;f<=10;f++) {
				System.out.print(f1+" ");
				f1=f1+f2;
				f2=f1-f2;

	}

}
}
