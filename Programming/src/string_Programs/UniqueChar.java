package string_Programs;

public class UniqueChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="hello";
		char[] a= s.toCharArray();
		
		for(int i=0;i<a.length;i++) {
			int count=1;
			for(int j=i+1;j<a.length;j++) {
				if(a[i]==a[j]) {
					count++;
					a[j]=Character.MAX_VALUE;
				}
				
			}
			if(a[i]!=Character.MAX_VALUE && count==1) {
				System.out.println(a[i]+ "-->"+count);
			}
		}
	}

}
