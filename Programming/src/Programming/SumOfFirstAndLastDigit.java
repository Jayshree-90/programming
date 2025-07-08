package Programming;

public class SumOfFirstAndLastDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = 3908;
		int last=n%10;
		int first=0;
		while(n!=0) {
			first=n%10;
			n=n/10;
		}

		System.out.println(last);
		
		System.out.println(first); 
		System.out.println("sum of last and first digit is "+(last+first));
	}

}
