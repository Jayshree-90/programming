package string_Programs;

import java.util.Arrays;

public class Smallest_element_in_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "my name is rena";
		String[] a = s.split(" ");
		System.out.println(Arrays.toString(a));
		String min= a[0];

		for (int i = 0; i < a.length; i++) {

			if (a[i].length() < min.length()) {
				min = a[i];

			}
		}
		System.out.print("Smallest element in String is "+min);

	}

}
