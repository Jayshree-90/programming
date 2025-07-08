package Programming;

import java.util.Scanner;

public class LastDigitOfNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		System.out.println("Enter no");
		int n = s.nextInt();
		int rem = n % 10;
		System.out.println("Last Digit is "+rem);

		// Printing the last digit of the number
		while (n != 0) {

			// Finding the remainder (Last Digit)
			int remainder = n % 10;

			// Printing the remainder/current last digit
			System.out.println(remainder);

			// Removing the last digit/current last digit
			n = n / 10;
		}
		
        int n2 = 9905;
        int sum =0;
        while (n2 != 0)
        {
            sum = sum + n2 % 10;
            n2 = n2/10;
            
        }
        
        System.out.println("sum of digits "+sum);

	}

}
