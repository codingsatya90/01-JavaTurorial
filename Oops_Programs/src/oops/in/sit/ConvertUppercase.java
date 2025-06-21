package oops.in.sit;

import java.util.Scanner;

public class ConvertUppercase {

	String converstring(String name) {
		
		System.out.println(name.toUpperCase());
		return name;

	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		ConvertUppercase up=new ConvertUppercase();
		
		System.out.println("Enter your name");
		String name=sc.nextLine();
		up.converstring(name);
		
		
	}

}
