package string_Programs;

public class SmallestCharinString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "addshshjjkz";
		char[] a=s.toCharArray();
		char min=a[0];
		 for(int i=0;i<a.length;i++) {
			 if(min>a[i]) {
				 min=a[i];
			 }
			 
		 }
		
		System.out.println("smallest char in "+s+" is "+min);

	}

}
