package assignment5;
class InvalidAge extends Exception {
	InvalidAge(String s) {
		super(s);
	}
}

public class ValidateAge {
	
	public void Agecheck(int age) throws Exception {
		if(age<15) {
			InvalidAge iva = new InvalidAge("Ineligible to vote");
			throw (iva);
		}
		else  {
			System.out.println("Eligible to vote");
		}
		
	}
	public static void main(String[] agrs){
		ValidateAge va= new ValidateAge();
		try {
			va.Agecheck(12);
		}
		catch(Exception m) {
			System.out.println("Exception Occured: "+m);
		}
		
	}
}
