package Patternss;

public class Step4_Patterns {

	public static void main(String[] args) {
		System.out.println("Upper Pyramid");
		int n=4;

		for (int i = 1; i <= 4; i++) {
			for (int j = 1; j <= n*2-1; j++) {
				if ((i+j >= n+1) &&  (j-i <=n-1)) {
					System.out.print(" *");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		
		System.out.println("Upper Pyramid");

		for (int i = 1; i <= 4; i++) {
			for (int j = 1; j <= n*2-1; j++) {
				if (j>=i  &&  (j+i <=n*2)) {
					System.out.print(" *");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}

	}

}
