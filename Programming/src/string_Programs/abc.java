package string_Programs;

public class abc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1= "HewFg";
		 for(int i=0;i<s1.length();i++) {
			 char ch=s1.charAt(i);
			 if(ch>='a' && ch<='z') {
				 int n=ch-32;
				System.out.print((char)n);
			 }
			 else if(ch>='A' && ch<='Z') {
				 int n=ch+32;
					System.out.print((char)n);
			 }
		 }
		 System.out.println();
		 System.out.println(s1);

	}

}
