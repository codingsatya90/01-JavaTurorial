package string.in.sit;

public class StartEndssWithMethodDemo01 {

	public static void main(String[] args) {

		String name = "Kaushal";

		// startsWith Method
		System.out.println(name.startsWith("K")); // true
		System.out.println(name.startsWith("a")); // false
		System.out.println(name.startsWith("Ka")); // true

		// endsWith Method

		System.out.println(name.endsWith("a"));  //false
		System.out.println(name.endsWith("al")); //true
		System.out.println(name.endsWith("l"));   //true

	}
}
