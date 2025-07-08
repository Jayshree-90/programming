package string_Programs;

import java.util.Arrays;

public class Largest_element_in_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "my name is rena";
		String[] a = s.split(" ");
		System.out.println(Arrays.toString(a));
		String max = a[0];

		for (int i = 0; i < a.length; i++) {

			if (a[i].length() > max.length()) {
				max = a[i];

			}
		}
		System.out.print("Largest element in String is "+max);
;

	}

}
