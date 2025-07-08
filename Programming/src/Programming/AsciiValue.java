package Programming;

public class AsciiValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("ASCII value of A to Z:");
		for(char ch='A';ch <='Z';ch++) {
			int asciiValue = (int) ch;
			System.out.println(ch+" : "+asciiValue);
		}
		
		for(char ch='A';ch <='D';ch++) {
			for(int j=1;j<=4;j++) {
			//int asciiValue = (int) ch;
			System.out.print(ch+" ");
		        }
			System.out.println("  ");
		}
		
		System.out.println(" ");

	}

}
