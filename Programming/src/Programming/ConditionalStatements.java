package Programming;

import java.util.Scanner;

public class ConditionalStatements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * 1) If 
		 *  1) WAJP to check whether an given integer number is even ,if even print
		 * "hi" if not do nothing? 
		 * 2) WAJP to check given number is positive or not? ¬¬¬
		 * 2) If-else 1)WAJP find given number is positive or negative I/p:- 4
		 * O/p:-Positive number I/p:- -21 O/p:-Negative number
		 * 
		 * 2)WAJP find largest among two number I/p:-10,20 O/p: 20
		 * 
		 * 3)WAJP check given number is even or odd I/p:-4 O/p:Even number I/p:-9
		 * O/p:-Oddnumber
		 * 
		 * 4)WAJP check whether the given number is divisible by 5 or not I/p:-25
		 * O/p:-Given number is divisible by 5
		 */
		
		Scanner s = new Scanner(System.in);
		System.out.println("enter no");
		
		int num  = s.nextInt();  
		
		//even odd
		if(num%2==0) {
			System.out.println("hi");
		}
		else System.out.println("odd");
		
		//negative positive
		if(num>=0) {
			System.out.println("positive");
		}
		else System.out.println("negative");
		
		//divisible by 5
	    if(num%5==0) {
	    	System.out.println("divisible by 5");
	    }
	    else System.out.println("not divisible by 5");
	    
	    //5)Tom wants buy a Tshirt,tom tshirt size is small and  
	    //tshirt price should less than or equal to 1000

	    char size='s'; int price =900;
	    
	    if(size=='s' && price<=1000) {
	    	System.out.println("buy");
	    }
	    
	   // WAJP Take input from user as character ,check that character 
	  //belong to uppercase or lower case or number or special character
	    Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char inputChar = scanner.next().charAt(0);
        //scanner.close();

        if (Character.isUpperCase(inputChar)) {
            System.out.println("Character is Uppercase.");
        } else if (Character.isLowerCase(inputChar)) {
            System.out.println("Character is Lowercase.");
        } else if (Character.isDigit(inputChar)) {
            System.out.println("Character is a Number.");
        } else {
            System.out.println("Character is a Special Character.");
        }

        //WAJP take input from user as integer based on that number print particular month
        System.out.print("Enter a number: ");
        int num2 = scanner.nextInt();
        if(num2==1) {
        	System.out.println("Jan");
        }
        else if(num2 ==2) {
        	System.out.println("Feb");
        }
        else if(num2 ==3) {
        	System.out.println("Mar");
        }
        else if(num2 ==4) {
        	System.out.println("Apr");
        }
        else System.out.println("enter between 1 to 4");
        
        System.out.print("Enter an integer: ");

        int number = scanner.nextInt();
        String numberAsString = String.valueOf(number);

        System.out.println("The number as a string is: " + numberAsString);
        scanner.close();

        
        




	}

}
