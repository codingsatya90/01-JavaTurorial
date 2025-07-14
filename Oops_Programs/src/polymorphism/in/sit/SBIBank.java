package polymorphism.in.sit;

class RBIBank{
	boolean checkEligibility() {
		//docs verification logic
		return true;
	}
	double getHomeLoanRofi() {
		return 10.85;
	}
}
public class SBIBank extends RBIBank {
	
	//overriding parent method to give my own fofi
	double getHomeLoanRofi() {
		return 12.85;
	}
	
	public String applyHomeLoan() {
		boolean status=checkEligibility(); //parent
		if(status) {
			double homeLoanRofi=getHomeLoanRofi(); //child method
			String msg="Your loan approved with RI as::"+homeLoanRofi;
			return msg;
		}else {
			return "You are not eligible fro home loan";
		}
	}
	public static void main(String[] args) {
		SBIBank bank=new SBIBank();
		String msg=bank.applyHomeLoan();
		System.out.println(msg);
		
		
	}
}


