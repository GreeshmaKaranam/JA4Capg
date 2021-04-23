package pack4;

public class Validater {

	public void checkage(int age) throws  ValidVoterException ,InvalidVoterException 
	{
		if(age>=18) {
			ValidVoterException ve = new ValidVoterException ("Eligible");
			throw(ve);
		}
		else {
			InvalidVoterException ie = new InvalidVoterException ("not Eligible"); 
			throw(ie);
		}
}

}
