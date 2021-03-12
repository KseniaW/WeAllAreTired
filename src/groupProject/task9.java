package groupProject;

public class task9 {

	public static void main(String[] args) {
		int[] a = { -1460, -200,1460,3, 45, 89, 76, 45, 125, 367, 145 };

		int large, secondLarge;

		large =0;
		secondLarge = 0;

		for (int i = 0; i < a.length; i++) {
			if (a[i] > large) {
				secondLarge = large;
				large = a[i];
			} else if (a[i] > secondLarge && a[i]!=large) {
				secondLarge = a[i];
			}

		}
		System.out.println(large);
		System.out.println(secondLarge);

	}

}
