package Programming;

public class Inner_Outer_Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=1043;
		int last=n%10;
		n=n/10;
		int iSum=0,oSum=0;
		
		while(n>=10) {
			int rem=n%10;
			iSum=iSum+rem;	
			n=n/10;
		}
		
		oSum=last+n;
		System.out.println("InnerSum "+iSum);
		System.out.println("OuterSum "+oSum);
		
		//xylem is sum of outerdigits is equals to outer digits
		if(oSum==iSum) {
			System.out.println("Number is Xylem");
		}
		else {
			System.out.println("Number is phloem");
		}
	}

}
