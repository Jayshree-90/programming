package string_Programs;

public class Occursance_of_Word {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "Hello Hello MY name is";
		String[] a = s.split(" ");

		for (int i = 0; i < a.length; i++) {
			int c = 1;
			for (int j = i + 1; j < a.length; j++) {
				if (a[i].equals(a[j])) {
					c++;
					a[j] = "";
				}
			}
			if (a[i] != "") {
				System.out.println(a[i] + "-->" + c);
			}
		}

	}

}
