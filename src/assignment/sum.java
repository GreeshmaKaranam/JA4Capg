package assignment;
import java.util.Scanner;
public class sum {
	int total;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = sc.nextInt();
		sum s = new sum();
		System.out.println(s.calculateSum(n));
		sc.close();
	}
	
	public int calculateSum(int n){
		total = 0;
		for(int i = 1;i<=n;i++) {
			if((i%3==0)||(i%5==0)) {
				total = total + i;
			}
		}
		return total;
	}

}
