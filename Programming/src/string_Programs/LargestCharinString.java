package string_Programs;

public class LargestCharinString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "addshshjjkz";
		
		char[] a=s.toCharArray();
		char max=a[0];

		for (int i = 0; i < a.length; i++) {
            if(max<a[i]) {
            	max=a[i];            	
            }
            
		}
		System.out.println("largest char in "+s+" is "+max);
	}

}
