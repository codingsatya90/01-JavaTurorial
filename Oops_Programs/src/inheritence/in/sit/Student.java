package inheritence.in.sit;
class User{
	int id;
	String name;
}

public class Student extends User {
	int rank;
	public static void main(String[] args) {
		//creating parent class obj
		User user=new User();
		user.id=101;
		user.name="Satya";
		
	//	user.rank=1; //invalid bcz  parent can't access child properties.
		System.out.println(user.id+" "+user.name);
	}

}
