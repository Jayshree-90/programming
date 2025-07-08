package string_Programs;

public class NoOfOccurance {

	public static void main(String[] args) {
		// Write java code to count for number of occurances "aabbbcccd"
		
		String s = "aabbbcccd";
		char[] a= s.toCharArray();
		
		for(int i = 0;i<a.length;i++)
		{  int c=1;
		for(int j=i+1;j<a.length;j++) {
			 if(a[i]==a[j]) {
				 c++;
				 a[j] = Character.MAX_VALUE;
			 }
			
			// System.out.println(a[i]+ " "+c);
		}
		 if (a[i] != Character.MAX_VALUE) {
				System.out.println(a[i] + " ---> " + c);
			}
		  
			
		}

	}

}
