package Programming;

import java.util.Scanner;

public class AtmProgram {
	public static void main(String[] args) {
		int balance = 5000, withdraw, deposit;
		Scanner s = new Scanner(System.in);

		while (true) {
			/*
			 * 1)A/c Details 2)Deposit 3)Withdraw 4)Check balance 5)Exit
			 */

          System.out.println("ATM \n Choose \n 1)A/c Details \n 2)Deposit \n 3)Withdraw \n 4)Check balance \n 5)Exit");
			

			int n = s.nextInt();
			switch (n) {
			
			case 1:
				System.out.print("Enter money to be deposited:");
				deposit = s.nextInt();
				balance = balance + deposit;
				System.out.println("YMoney has been successfully deposited \n");
				break;
				
			case 2:
				System.out.print("Enter money to be withdrawn:");
				withdraw = s.nextInt();
				if (balance >= withdraw && balance<=0) {
					balance = balance - withdraw;
					System.out.println("Please collect your money");
				} else {
					System.out.println("Insufficient Balance");
				}
				System.out.println("");
				break;

			case 3:
				System.out.println("Balance : " + balance);
				System.out.println("");
				break;

			case 4:
				System.exit(0);
			}
		}
	}
}
