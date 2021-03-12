package groupProject;

public class task8 {

	public static void main(String[] args) {
		int[] a = { 900, 11, 2, 98, -100, 0 };

		int max = a[0];

		for (int i = 1; i < a.length; i++) {
			if (a[i] > max) {
				max = a[i];
			}
		}
		System.out.println("Maximum value is "+max);
		
		int min=a[0];
		
		for(int i=1;i<a.length;i++) {
			if(a[i]<min) {
				min=a[i];
			}
		}
		System.out.println("Miminum value is "+min);
	}

}
