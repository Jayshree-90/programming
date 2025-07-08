package string_Programs;

public class UniqueWord {

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
			if (a[i] != "" && c==1) {
				System.out.println(a[i] + "-->" + c);
			}
		}



	}

}
