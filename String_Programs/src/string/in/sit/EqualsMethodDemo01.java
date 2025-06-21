package string.in.sit;

public class EqualsMethodDemo01 {

	public static void main(String[] args) {
		String s1 = "Hello";
		String s2 = "Java";
		String s3 = "Hello";
		System.out.println(s1.equals(s2)); // false
		System.out.println(s1.equals(s3)); // true
	}
}
