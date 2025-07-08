package string_Programs;

import java.util.Arrays;

public class Anagrams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "Care";
		String s2 = "raCe";

		char[] a = s1.toCharArray();
		char[] b = s2.toCharArray();

		Arrays.sort(a);
		Arrays.sort(b);

		String s3 = new String(a);
		String s4 = new String(b);

		if (s3.equals(s4)) {
			System.out.println("Anagram");
		} else
			System.out.println("Not An Anagram");

	}

}
