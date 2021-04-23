package pack2;
//Scanner:
import java.util.Scanner;
public class example9 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Name");
		String name = sc.next();
		System.out.println("Enter branch name");
		String bc = sc.next();
		System.out.println("Enter email id");
		String em = sc.next();
		System.out.println("Enter phonenum");
		int pn = sc.nextInt();
		System.out.println("Enter percentage");
		int pt = sc.nextInt();
		System.out.println("Name:"+name+"\nBranch:"+bc+"\nemail id:"+em+"\nphone num:"+pn+"\npercentage:"+pt);
		if(pt > 60) {
			System.out.println("Eligible");
		}
		else {
			System.out.println("Not Eligible");
		}
		sc.close();
		
	}
}
