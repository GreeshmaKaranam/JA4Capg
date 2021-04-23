package assignment;
import java.util.Scanner;
public class increasingnum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = sc.nextInt();
		increasingnum in = new increasingnum();
		if(in.checkNumber(n)) 
			System.out.println(n+ " is an increasing number");
		else 
			System.out.println(n+ " is not an increasing number");
		sc.close();
	}
	public boolean checkNumber(int number) {
		int max  = 9;
		while(number != 0) {
			if(number %10 > max) {
				return false;			
			}
			max = number %10;
			number = number/10;
		}
		return true;
	}

}
