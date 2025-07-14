package encapsulation.in.sit;

class Account{
	private int accNum;
	private String name;
	
	public int getAccNum() {
		return accNum;
	}
	public void setAccNum(int accNum) {
		this.accNum = accNum;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
public class Test01 {
	public static void main(String[] args) {
		
		Account obj=new Account(); //obj creation
		
		obj.setAccNum(01231110110);	
		obj.setName("Satya");
		
		int accNum=obj.getAccNum();
		String name=obj.getName();
		System.out.println(accNum+" "+name);
	}

}
