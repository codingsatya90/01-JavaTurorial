package oops.in.sit;

import java.util.Scanner;

public class Test1 {

	
	Person1 m1(int id) {
		Person1 p=new Person1();
		
		if(id==101) {
			p.id=101;
			p.name="Raja";
			p.age=30;
		}
		else if(id==102) {
			p.id=102;
			p.name="Rani";
			p.age=32;
		}
		return p;
	}
	
	public static void main(String[] args) {
		
		Test1 t1=new Test1();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter currect id:");
		int id=sc.nextInt();
		Person1 p=t1.m1(id);
		
		if(p.id==id) {
			System.out.println(p.id+" "+p.name+" "+p.age);
		}
	   else{
		System.out.println("No Recoud found.");
		
	}
	
}



}



class Person1{
	int id;
	String name;
	int age;
	
}
