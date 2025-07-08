package ArrayPrograms;

import java.util.Scanner;

public class Array_Creation {
	public static void main(String[] args) {
		
		int a[] = new int[3];
		a[2]=2;
		a[1]=8;
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
	//	System.out.println(a[3]);
		System.out.println("-------------------");
		

		Scanner s = new Scanner(System.in);
		System.out.println("Enter array size");
		int size = s.nextInt();

		int[] b = new int[size];

		System.out.println("enter array values");

		for (int i = 0; i < b.length; i++) {
			b[i] = s.nextInt();
		}

		System.out.println("data in array is");
		for (int i = 0; i < b.length; i++) {
			System.out.println(b[i] + " ");
		}
		System.out.println("---------c is---------");
		int c[] = {8,8,6,7};
		for(int i=0;i<c.length;i++) {
			System.out.print(
					c[i]+" ");
		}
		//System.out.println(c);
		
		

	}
}