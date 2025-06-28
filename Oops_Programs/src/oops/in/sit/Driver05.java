package oops.in.sit;


//Q. Write a java method which will give Person object with data
public class Driver05 {
	
	
	Person m1() {
		Person p=new Person();
		p.id=101;
		p.name="Satya";
		p.age=21;
		
		return p;
	}
	public static void main(String[] args) {
		
		Driver05 d=new Driver05();
		Person p=d.m1();
		
		System.out.println(p.id+"  "+p.name+" "+p.age);
	}
	

}
class Person{
	int id;
	String name;
	int age;
	
}
