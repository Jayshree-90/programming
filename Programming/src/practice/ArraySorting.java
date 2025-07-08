package practice;

public class ArraySorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = { 7654, 76, 99, 3457, 90, 4 };
		
		for(int i=0;i<a.length;i++) {
			int temp=0;
			for(int j=i+1;j<a.length;j++) {
				if(a[i]>a[j]) {
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
			System.out.print(a[i]+" ");

		}

	}
}