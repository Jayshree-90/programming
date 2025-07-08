package Patternss;

public class Opposite_L {

	public static void main(String[] args) {
		for(int r=1;r<=4;r++) {
			for(int c=1;c<=4;c++) {
				if(r==4||c==4) {
				System.out.print(" *");
				}
				else {
					System.out.print("  ");//2 spaces to move cursor to forward
				}
			}
			System.out.println();
		}

	}

}
