package Programming;

import java.util.Scanner;

public class FactorialNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Number");
		int n = s.nextInt();
		int factorial = 1;
		
		if (n < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
        } else {
            for (int i = 1; i <= n; i++) {
                factorial *= i;
            }
            System.out.println("Factorial of " + n + " is: " + factorial);
        }
        s.close();


	}

}
