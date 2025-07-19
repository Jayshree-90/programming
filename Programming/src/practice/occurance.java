package practice;

public class occurance {

	public static void main(String[] args) {
		// TODO Auto-generated method 
      String s="aannnii";
      char []c=s.toCharArray();
      
      
      for(int i=0;i<c.length;i++) {
    	  int count=1;
    	  for(int j=i+1;j<c.length;j++) {
    		  if(c[i]==c[j]) {
    			  count++;
    			  c[j] = Character.MAX_VALUE;
				}
			}
			if (c[i] != Character.MAX_VALUE) {
				System.out.println(c[i] + " ---> " + count);
			}
      }
	}

}
