package oops.in.sit;

public class Person01 {
	int id;
	String name;

	//Case-2 :method should give 3 person object as output
//	Person01[] m2() {
//		
//		Person01 p1=new Person01();
//		p1.id=101;
//		p1.name="Raja";
//		
//		Person01 p2=new Person01();
//		p1.id=102;
//		p1.name="Rani";
//		
//		Person01 p3=new Person01();
//		p1.id=103;
//		p1.name="Rakesh";
//		
//		Person01 [] arr= {p1,p2,p3};
//		return arr;
//		
//	}
	// case -1 :method should take 2 person object as input
	static void m1(Person01 p1, Person01 p2) {
		System.out.println(p1.id + " " + p1.name);
		System.out.println(p2.id + " " + p2.name);
	}

	public static void main(String[] args) {

		
		Person01 p=new Person01(); //create obj-1
		
		Person01 p1=new Person01();//create obj-2
		p1.id=101;
		p1.name="Ram";
		
		Person01 p2=new Person01();//create obj-3
		p2.id=102;
		p2.name="Shita";
		
		p.m1(p1, p2); // m1 method call
		
//		
//		Person01[] arr=p.m2(); //m2 method call
//		
//		for(Person01 person:arr) {
//			System.out.println(person.id+" "+person.name);
//		}
	}
}
