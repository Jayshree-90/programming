package string_Programs;

import java.util.Arrays;

public class Convert_FirstLetter_of_Each_Word {

	public static void main(String[] args) {
		String s = "my name is rena";
		String[] a = s.split(" ");
		System.out.println(Arrays.toString(a));

		for (int i = 0; i < a.length; i++) {
			String s1 = a[i];

			
				for (int j = 0; j < s1.length(); j++) {
					char ch = s1.charAt(j);
					if (j == 0 && ch >= 'a' && ch <= 'z') {
						int n = ch - 32;
						System.out.print((char) n);
					} else {
						System.out.print(ch);
					}

				}
				System.out.print(" ");
			}

		
	}

}
