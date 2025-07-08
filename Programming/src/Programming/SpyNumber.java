package Programming;

public class SpyNumber {

	public static void main(String[] args) {
		// Spy number is sum of digits is equal to product/multiplication of digits
		int n=345;
		int temp=n;
		int sum=0,product=1;
		while(n!=0) {
			int rem=n%10;
			sum=sum+rem;
			product=product*rem;
			n=n/10;
		}
		System.out.println(sum+"-->"+product);
		if(sum==product) {
		System.out.println(temp+" is a spy number");
		}
		else
		System.out.println(temp+" is not a spy number");
	}

}
