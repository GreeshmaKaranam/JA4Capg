package pack2;
import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
public class password {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the password");
		String password = sc.next();
		String validchar = "^(?=.*[a-z])(?=.*[A-Z])"+"(?=.*[0-9])"+"(?=.*[@#$%^&*])+{8}";
		Pattern ptr = Pattern.compile(validchar);
		Matcher mtr = ptr.matcher(password);
	//	boolean cnd = mtr.matches();
		if(mtr.matches()) {
			System.out.println("Correct Password");
	}
		else {
			System.out.println("Incorrect Password");
		}
		sc.close();
	}
}
