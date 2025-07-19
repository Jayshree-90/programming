package practice;

public class findNumberInString {

	public static void main(String[] args) {
		String s = "mumb34688ai";
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);

			if (ch >= '0' && ch <= '9') {

				System.out.print(ch);
			}
		}

	}

}
