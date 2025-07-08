package practice;

public class SortingWithoutThirdVariable {
	public static void main(String[] args) {
		int a =20;
		int b = 90;

		a = a + b;//92
		b = a - b;//92-90
		a = a - b;//90-2
		System.out.println("a "+a);
		System.out.println("b "+b);
	}

}
