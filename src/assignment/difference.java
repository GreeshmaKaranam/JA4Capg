package assignment;
import java.util.Scanner;
public class difference {
	int total;
	int sumofsquares;
	int sum;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = sc.nextInt();
		difference df = new difference();
		System.out.println(df.calculateDifference(n));
		sc.close();
	}
	
	public int calculateDifference(int n) {
		int square;
		total =0;
		sumofsquares =0;
		for(int i=0;i<=n;i++) {
			total = total + i;
			square = i*i;
			sumofsquares = sumofsquares+ square;
		}
			System.out.println(total*total);
			System.out.println(sumofsquares);

		sum = Math.abs(sumofsquares - (total*total));
		return sum;
	}

}
