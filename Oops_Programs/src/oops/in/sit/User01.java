package oops.in.sit;

public class User01 {
	public static void main(String[] args) {

		User01 u1 = new User01();
		System.out.println(u1.hashCode());

		User01 u2 = new User01();
		System.out.println(u2.hashCode());

		User01 u3 = new User01();
		System.out.println(u3.hashCode());
	}
}
