package string_Programs;

public class Occurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "addshshjjkz";
		char[] a = s.toCharArray();

		for (int i = 0; i < a.length; i++) {
			int count = 1;
			for (int j = i + 1; j < a.length; j++) {
				if (a[j] == a[i]) {
					count++;
					a[j] = Character.MAX_VALUE;
				}
			}
			if (a[i] != Character.MAX_VALUE) {
				System.out.println(a[i] + " ---> " + count);
			}
		}

	}

}
