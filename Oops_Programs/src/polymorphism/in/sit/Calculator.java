package polymorphism.in.sit;


public class Calculator {
	//using Overloading method 
	void add(int i,int j) {
		System.out.println("Sum from 1st method:"+(i+j));
	}
	void add(int i,int j,int k) {
		System.out.println("Sum from 2nd method:"+(i+j+k));
	}
	public static void main(String[] args) {
		Calculator c=new Calculator();
		c.add(10, 12);
		c.add(10, 4, 9);
	}

}
