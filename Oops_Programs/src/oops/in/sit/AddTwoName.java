package oops.in.sit;

import java.util.Scanner;

public class AddTwoName {

	public String concatName(String fname, String lname) {
		
		return fname+lname;
	}

	public static void main(String[] args) {
		AddTwoName name = new AddTwoName();
		
		Scanner sc=new Scanner(System.in);
		String name1=sc.next();
		String name2=sc.next();
         
		name.concatName(name1,name2);
		
		System.out.println(name1.concat(name2));

	}
}
