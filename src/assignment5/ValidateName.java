package assignment5;
class InvalidFirstName extends Exception {
	InvalidFirstName(String msg) {
		super(msg);
	}
}
class InvalidLastName extends Exception {
	InvalidLastName(String msg) {
		super(msg);
	}
}
public class ValidateName {
	
	public void NameCheck(String fn, String ln) throws InvalidFirstName, InvalidLastName {
		if(fn == " ") { 
			InvalidFirstName ifn = new InvalidFirstName("Invalid FirstName of Employee");
			throw(ifn);
		}
		if(ln == " ") { 
			InvalidLastName iln = new InvalidLastName("Invalid LastName of Employee");
			throw(iln);
		}
		else {
			System.out.println("Valid Name");
		}
		
	}
	
	public static void main(String[] args) {
		 ValidateName vn = new  ValidateName();
		 try {
			 vn.NameCheck("Greeshma", " ");
		 }
		 catch (InvalidFirstName m) {
			 System.out.println("Exception Occured: "+m);
		 }
		 catch(InvalidLastName e) {
			 System.out.println("Exception Occured: "+e);
		 }
	}

}
