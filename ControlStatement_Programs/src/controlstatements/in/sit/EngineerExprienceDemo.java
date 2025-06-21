package controlstatements.in.sit;

import java.util.Scanner;

public class EngineerExprienceDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter  number of Year Exprience");
		int exp = sc.nextInt();

		if (exp >= 0 && exp <= 2) {
			System.out.println("Associate Engineer");
		} else if (exp >= 3 && exp <= 5) {
			System.out.println("Software Engineer");
		} else if (exp >= 6 && exp <= 9) {
			System.out.println("Sr. Software Engineer");
		} else if (exp >= 10 && exp <= 13) {
			System.out.println("Manager");
		} else {
			System.out.println("Role Not Found");
		}

	}

}
