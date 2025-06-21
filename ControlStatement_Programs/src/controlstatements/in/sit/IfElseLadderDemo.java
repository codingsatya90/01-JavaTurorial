package controlstatements.in.sit;

import java.util.Scanner;

public class IfElseLadderDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any Number");
		int num = sc.nextInt();
		if (num > 0) {
			System.out.println("Positive Number");
		} else if (num < 0) {
			System.out.println("Nagitive Number");
		} else {
			System.out.println("Zero");
		}
	}
}
