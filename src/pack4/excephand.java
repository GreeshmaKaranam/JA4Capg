package pack4;

public class excephand {
	public static void main(String[] args) {
		
		try {
		System.out.println("Hello");
		System.out.println(10/0); // error and the next statement will also not execute. (directly goes to catch block);
		System.out.println("Greeshma");
		
		String name = "Karanam";
		System.out.println(name.charAt(4));
		
		String []arr = {"Karanam", "Greeshma"}; //directly goes to catch block
		System.out.println(arr[5]);
	}
		catch(ArithmeticException e) {
			System.out.println("Can't divide by zero");//if this exception occurs,this statement will get executed and final block will get executed.
		}
		catch(ArrayIndexOutOfBoundsException ae) {
			System.out.println("Check array size");
		}
		catch(Exception ee) {
			System.out.println("Check your inputs");
		}
/*		finally {
			System.out.println("I am from final block"); //this will execute by default.
		
		}*/
	}

}
