package switchstatement.in.sit;

import java.util.Scanner;

public class Shoes {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Brand Name");
		String brand = sc.next();

		switch (brand) {
		case "Nike":
			System.out.println("Just do it");
			break;
		case "Adidas":
			System.out.println("Impossible is nothing");
			break;
		case "Puma":
			System.out.println("Forever Faster");
			break;
		case "Reebok":
			System.out.println("I am What I am");
			break;
		default:
			System.out.println("Not Found Brand Name");
		}

	}

}
