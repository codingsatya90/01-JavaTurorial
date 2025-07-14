package constructor.in.sit;

public class Student {

	int id; 
	String name;
	int age;
	String gender;
	
	public Student(int id,String name,int age,String gender) {
		this.id=id;
		this.name=name;
		this.age=age;
		this.gender=gender;
		System.out.println(this.id+" "+this.name+" "+this.age+" "+this.gender);
		
		
	}
	public static void main(String[] args) {
		Student s1=new Student(1,"Raja",23,"Male");
		Student s2=new Student(2,"Rani",28,"Female");
		
	}
}
