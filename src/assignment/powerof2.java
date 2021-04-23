package assignment;
import java.util.*;
public class powerof2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = sc.nextInt();
		powerof2 po= new powerof2();
		if(po.checkNumber(n)) 
			System.out.println(n+ " is a power of 2");
		else 
			System.out.println(n+ " is not a power of 2");
		sc.close();
	}
	public boolean checkNumber(int n) {
		if(n==1) {
			return false;
		}
		if(n==0) {
			return true;
		}
		while(n!=1) {
			if(n % 2 != 0) {
				return false;
			}
			n = n/2;
		}
		return true;
	}

}
