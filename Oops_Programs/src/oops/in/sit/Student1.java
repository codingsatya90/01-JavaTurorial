package oops.in.sit;

public class Student1 {
	String name;
	String email;
	long phno;
	static String institute;
	public static void main(String[] args) {
		
		Student1 n=new Student1();
		n.name="Satyanarayan";
		
		Student1 e=new Student1();
		e.email="satya.k.0078@gmail.com";
		
		Student1 num=new Student1();
        num.phno=9060176797l;
        
        Student1.institute="SIT institute";
        
        System.out.println("Name:"+n.name);
        System.out.println("Email:"+e.email);
        System.out.println("Phone No:"+num.phno);
        System.out.println("Institute Name:"+Student1.institute);
	}

}
