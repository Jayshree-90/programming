package Patternss;

public class Basic1 {

	public static void main(String[] args) {
		for (int i = 1; i <= 3; i++) {// row count=3
			for (int j = 1; j <= 5; j++) {// column count =5
				System.out.print("* ");// same line
			}
			System.out.println();// new line
		}

		System.out.println("Inverted L");
		for (int i = 1; i <= 4; i++) {
			for (int j = 1; j <= 4; j++) {
				if (i == 1 || j == 1) {
					System.out.print(" *");
				} else {
					// System.out.println(" ");
				}
			}
			System.out.println();
		}

		System.out.println("inverted U ");
		for (int i = 1; i <= 4; i++) {
			for (int j = 1; j <= 4; j++) {
				if (i == 1 || j == 1 || j == 4) {
					System.out.print(" *");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}

		System.out.println(" U ");
		for (int i = 1; i <= 4; i++) {
			for (int j = 1; j <= 4; j++) {
				if (i == 4 || j == 1 || j == 4) {
					System.out.print(" *");
				} else {
					System.out.print("  ");// for last line we should print 2 spaces
				}
			}
			System.out.println();
		}

		System.out.println(" Diagonal ");
		for (int i = 1; i <= 4; i++) {
			for (int j = 1; j <= 4; j++) {
				if (i == j) {
					System.out.print(" *");
				} else {
					System.out.print("  ");// for last line we should print 2 spaces
				}
			}
			System.out.println();
		}

		System.out.println("inverse Diagonal ");
		int n = 4;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if (i + j == n + 1) {
					System.out.print(" *");
				} else {
					System.out.print("  ");// for last line we should print 2 spaces
				}
			}
			System.out.println();
		}

		System.out.println("inverse Diagonal ");
		int n1 = 4;
		for (int i = 1; i <= n1; i++) {
			for (int j = 1; j <= n1; j++) {
				if (i == j || i + j == n + 1) {
					System.out.print(" *");
				} else {
					System.out.print("  ");// for last line we should print 2 spaces
				}
			}
			System.out.println();
		}

		System.out.println(" Z ");
		for (int i = 1; i <= n1; i++) {
			for (int j = 1; j <= n1; j++) {
				if (i == j || i + j == n + 1) {
					System.out.print(" *");
				} else {
					System.out.print("  ");// for last line we should print 2 spaces
				}
			}
			System.out.println();
		}

		System.out.println("----Primary Diagonal----");
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if (i == j) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		System.out.println("----Secondary Diagonal----");
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if (i + j == n + 1) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		System.out.println("------Z-shape----");
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if (i == 1 || i + j == n + 1 || i == n) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		System.out.println("------N-shape----");
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if (j == 1 || i == j || j == n) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		System.out.println("------Left Arrow----");
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if (i == 1 || j == 1 || i == j) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}

		System.out.println("------Right Arrow----");
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if (i == 1 || j == n || i + j == n + 1) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}

		System.out.println("------Down Arrow----");
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if (j == 1 || i + j == n + 1 || i == n) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}

		System.out.println("------Parallel----");
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if (j == 1 || j == n) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		System.out.println("------Equal----");
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if (i == 1 || i == n) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		System.out.println("------X-shape----");
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5; j++) {
				if (i == j || i + j == 5 + 1) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		System.out.println("------Inverted N-shape------");
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if (j == 1 || j == n || i + j == n + 1) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		System.out.println("------Box----");
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if (i == 1 || i == n || j == 1 || j == n || i == j || i + j == n + 1) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}

	}

}
