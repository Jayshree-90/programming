package Programming;

import java.util.Scanner;

public class char_belongs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Scanner s = new Scanner(System.in);
         System.out.println("enter char");
         char c =s.next().charAt(0);
         
         if(c>='A' && c<='Z') {
        	 System.out.println("uppercase");
         }
         else if(c>='a' && c<='z') {
        	 System.out.println("lowercase");
         }
         else if(c>='0' && c<='9') {
        	 System.out.println("digit");
         }
         else 
        	 System.out.println("special character");
         
	}

}
