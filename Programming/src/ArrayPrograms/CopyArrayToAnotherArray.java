package ArrayPrograms;

public class CopyArrayToAnotherArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int c[] = { 1, 2, 3, 4, 7, 9 };
		for (int i = 0; i < c.length; i++) {
			if (c[i] % 2 == 0) {
				System.out.print(c[i] + " ");
			}
		}

	}

}
