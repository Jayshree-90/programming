package string_Programs;

import java.util.Arrays;

public class Panagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "abcdefghijklmnnopqrstuvwxyzzz";

		char[] a = s1.toCharArray();
		System.out.println(Arrays.toString(a));

		// check occurance
		for (int i = 0; i < a.length; i++) {
			int count = 1;
			for (int j = i + 1; j < a.length; j++) {
				if (a[j] == a[i]) {
					a[j] = Character.MAX_VALUE;
				}
			}
		}
		System.out.println(Arrays.toString(a));
		
		int c=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]>='a' && a[i]<='z') {
				c++;
			}
		}
		System.out.println(c);
		if(c==26) {
			System.out.println("Panagram");
		}
		else
			System.out.println("Not panagram");
	}
	
	

}
