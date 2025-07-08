package string_Programs;

public class NumInString {

	public static void main(String[] args) {
		// Extract numbers from given string and add it "pu87ne"

		String s = "pun87e";
		char a[] = s.toCharArray();
		int sum = 0;
		
		for (int i = 0; i < a.length; i++) {
			int num = 0;
			if (a[i] >= '0' && a[i] <= '9')
		    num = a[i] - '0';
			sum = sum + num;
			//System.out.println(a[i]);

		}
		System.out.println(sum);

	}

}
