package string_Programs;

public class StringReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s= "hello";
		String rev ="";
		
		for(int i=s.length()-1;i>=0;i--) {
			char ch= s.charAt(i);
			rev=rev+ch;
		}
		
		System.out.println(rev);
		
		
		StringBuffer sb = new StringBuffer(s);
		sb.reverse();
		System.out.println(sb);
	}

}
