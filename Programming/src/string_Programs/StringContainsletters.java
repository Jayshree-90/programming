package string_Programs;

public class StringContainsletters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "hjcjhdsuitser87879";
		boolean flag = true;

		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);

			if (ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z') {
				flag = false;
				break;
			}
		}

		if (flag == true) {
			System.out.println("letters present");
		}

		else {
			System.out.println("letters not present");
		}

	}

}
