package polymorphism.in.sit;

public class SBIDemo {
	public static void main(String[] args) {
		
		SBIBank b1=new SBIBank();
		SBIBank b2=new SBIBank();
		
		boolean bankobjStatus=b1.equals(b2); //false
		System.out.println("Both Banks Are Equal??::"+bankobjStatus);
		
		String s1=new String("ashokit");
		String s2=new String("ashokit");
		
		boolean stringObjStatus=s1.equals(s2); //true
		System.out.println("Both String Are Equal??::"+stringObjStatus);
	}

}
