package inheritence.in.sit;

class User2 {
	int id;
	String name;

	public User2() {
		System.out.println("Parent class:: 0-param constructor called");

	}

}

public class Employee2 extends User2 {

	double salary;

	public Employee2() {
		System.out.println("child class:: 0-param constructor called");
        
	}
	void m2() {
		System.out.println("child class:: m2() method called");
		
	}
	public static void main(String[] args) {
		//creating object for child class
		Employee2 emp=new Employee2();
			
		
		//initialing Parent class properties using its own obj
		emp.id=101;
		emp.name="Satya";
		
		//initialing child class properties using its own obj
		emp.salary=4500.00;
		
		System.out.println(emp.id+ " "+emp.name+" "+emp.salary);
	}
}
