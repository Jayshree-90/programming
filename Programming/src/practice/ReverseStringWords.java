package practice;

public class ReverseStringWords {
	
public static void main(String[] args) {
	String s = "He broke up with me";
	
	String[] words=s.split(" ");
	
	for(int i=words.length-1;i>=0;i--) {
		System.out.print(words[i]+" ");
	}
}
}
