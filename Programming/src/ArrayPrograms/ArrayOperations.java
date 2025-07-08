package ArrayPrograms;

public class ArrayOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("---------even numbers---------");
		int c[] = { 1, 2, 3, 4, 7, 9 };
		for (int i = 0; i < c.length; i++) {
			if (c[i] % 2 == 0) {
				System.out.print(c[i] + " ");
			}
		}

		System.out.println("---------odd numbers---------");
		for (int i = 0; i < c.length; i++) {
			if (c[i] % 2 != 0) {
				System.out.print(c[i] + " ");
			}
		}
		int sum = 0;
		System.out.println("---------Sum of array---------");
		for (int i = 0; i < c.length; i++) {
			sum = sum + c[i];
		}
		System.out.println(sum);

		// prime number
		int[] a = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		for (int i = 0; i < a.length; i++) {

			int n = a[i];
			int count = 0;
			for (int j = 1; j <= n; j++) {
				if (n % j == 0) {
					count
					++;
				}
			}
			if (count == 2) {
				System.out.println(n);
			}
		}
	}

}
