package oops.in.sit;

public class Driver01 {
	public static void main(String[] args) {
         Driver01 d=new Driver01();
		Student s = new Student();
		s.id = 101;
		s.name = "Satya";
		d.print(s);
	}

	void print(Student s) {
		System.out.println(s.id+"   "+s.name);
	}

}

class Student {
	int id;
	String name;

	
}
