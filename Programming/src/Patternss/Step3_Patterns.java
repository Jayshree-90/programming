package Patternss;

public class Step3_Patterns {

	public static void main(String[] args) {
		System.out.println("leftUpperTriangle");

		for (int i = 1; i <= 4; i++) {
			for (int j = 1; j <= 4; j++) {
				if (i >= j) {
					System.out.print(" *");
				}
			}
			System.out.println();
		}
		int n = 4;

		System.out.println("RightUpperTriangle");

		for (int i = 1; i <= 4; i++) {
			for (int j = 1; j <= 4; j++) {
				if (i + j >= n + 1) {
					System.out.print(" *");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		
		System.out.println("Left Down Triangle");

		for (int i = 1; i <= 4; i++) {
			for (int j = 1; j <= 4; j++) {
				if (i + j <= n + 1) {
					System.out.print(" *");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		
		System.out.println("Right Down Triangle");

		for (int i = 1; i <= 4; i++) {
			for (int j = 1; j <= 4; j++) {
				if (i <= j) {
					System.out.print(" *");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		
		System.out.println("Left UpperTriangle");

		for (int i = 1; i <= 4; i++) {
			for (int j = 1; j <= 4; j++) {
				if (i==j ||  i==1 || j==4) {
					System.out.print(" *");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		
		System.out.println("Left UpperTriangle");

		for (int i = 1; i <= 4; i++) {
			for (int j = 1; j <= 4; j++) {
				if (i>j ||  i==4 || j==1) {
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
