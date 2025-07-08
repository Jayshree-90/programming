package Programming;

public class EvenDigitSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n =8902;
		int sum=0;
		
		while(n!=0) {
			int rem=n%10;
			if(rem%2==0) {
				sum=sum+rem;
			}
			n=n/10;
		}
		System.out.println("sum of even digit "+sum);

	}

}
