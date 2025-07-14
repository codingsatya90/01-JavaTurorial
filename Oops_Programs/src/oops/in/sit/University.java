package oops.in.sit;

import java.util.Scanner;

public class University {
	 int id;
	String  name;
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter currect id number::");
		int id=sc.nextInt();
		University u=University.m1(id);
		
		if(id==u.id) {
			System.out.println(u.id+" "+u.name);
		}else {
			System.out.println("Data not found");
		}
		 
		
			
	}
	
	static University m1(int id) {
		University u=new  University();
		if(id==101) {
			u.id=101;
			u.name="Oxford";
		}else if(id==102) {
			u.id=102;
			u.name="Sandford";
		}
		return u;
	}
		
		
	


}
