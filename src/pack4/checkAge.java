package pack4;
import java.util.Scanner;
public class checkAge {
	public static void main (String[] args) throws ValidVoterException ,InvalidVoterException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter age: ");
		int age = sc.nextInt();
		Validater ve = new Validater();
		ve.checkage(age);
		sc.close();
	}
}
