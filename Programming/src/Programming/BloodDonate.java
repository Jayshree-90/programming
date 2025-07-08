package Programming;

import java.util.Scanner;

public class BloodDonate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		System.out.println("Enter weight");
		int weight = s.nextInt();

		if (weight > 50) {
			System.out.println("Enter Blood group");
			char blood_group = s.next().charAt(0);
			if (blood_group == 'o') {
				System.out.println("Person is eligible");

			} else
				System.out.println("Not eligible");
		} else
			System.out.println("Not eligible");

	}

}
