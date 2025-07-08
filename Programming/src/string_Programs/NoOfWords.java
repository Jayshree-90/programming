package string_Programs;

public class NoOfWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Hello there how are you";
		String[] a= s.split(" ");
		System.out.println("No of words is "+a.length);
		
		int c=1;
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if(ch==' ') {
				c++;
			}
		}
		System.out.println("no of words is "+c);
		 
	}

}
