package string.in.sit;

public class StringBuilderDemo01 {

	public static void main(String[] args) {
		
	StringBuilder sb=new StringBuilder("java");
	System.out.println(sb.length());
	
	sb.append("Program");
	System.out.println(sb);
	System.out.println(sb.length());
	}
}
