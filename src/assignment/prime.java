package assignment;
import java.util.Scanner;
public class prime {
	int count,i,k;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = sc.nextInt();
		prime pm = new prime();
		pm.findprime(num);
		sc.close();
	}
	public void findprime(int num) {
		for(i=1; i<num; i++) {
		    count = 0;
			for(k=1;k<=i;k++) {
				if(i%k==0) 
					count++;
			}
			if(count == 2) 
				System.out.println(i);
		}
	}

}
