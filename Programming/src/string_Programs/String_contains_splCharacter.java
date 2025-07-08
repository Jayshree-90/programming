package string_Programs;

public class String_contains_splCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "^&&&**(((";
		boolean flag = true;

		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);

			if (ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z' || ch>'0' && ch<'9') {
				flag = false;
				break;
			}
		}

		if (flag == true) {
			System.out.println("special characters present");
		}

		else {
			System.out.println("special characters not present");
		}

	}

}
