package Patternss;

public class C_Pattern {

	public static void main(String[] args) {
		
		for(int i=1;i<=4;i++) {
			for(int j=1;j<=4;j++) {
				if(i==1||j==1||i==4) {
					System.out.print(" *");
				}
			}
			System.out.println();
		}

	}

}
