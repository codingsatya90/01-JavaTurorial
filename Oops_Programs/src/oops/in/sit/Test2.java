package oops.in.sit;

import java.util.Scanner;

public class Test2 {
	
	Player m1(int jerseyNumber) {
		
		Player p=new Player();
		
		
		if(jerseyNumber==7) {
			p.id=101;
			p.name="Doni";
			p.age=45;
		}
		else if(jerseyNumber==18) {
			p.id=102;
			p.name="Kohli";
			p.age=40;
		}else if(jerseyNumber==45) {
			p.id=103;
			p.name="Rohit Sharma";
			p.age=42;
		}
		return p;
	}
	
	public static void main(String[] args) {
		
		Test2 t= new Test2();
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter jersey Number ");
		int jerseyNumber=sc.nextInt();
		Player p=t.m1(jerseyNumber);
		
		System.out.println(p.id+" "+p.name+" "+p.age);
			
	}

}



class Player{
	
	int id;
	String name;
	int age;
}