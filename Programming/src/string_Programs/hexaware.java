package string_Programs;

public class hexaware {

	public static void main(String[] args) {
		
		
			String s="HexAwarE";
			
			for(int i=0;i<s.length();i++) {
				char ch =s.charAt(i);
				if( ch>='a' && ch<='z') {
					int n=ch-32;//small to capital
					System.out.print((char)n);
				}else if( ch>='A' && ch<='Z') {
					int n=ch+32;//capital to small
					System.out.print((char)n);
				}
				
				else {System.out.print(ch);}
			}
				

		}

	


	}


