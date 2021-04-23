package assignment;
import java.util.Scanner;
public class Fibonacci {
	int num1 = 1;
	int num2 = 1;
	int num3;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of sequence");
		int n = sc.nextInt();
		Fibonacci fb = new Fibonacci();
		fb.fibo(n);
		Fibonacci fb1 = new Fibonacci();
		fb1.fibonacci(n-2);
		sc.close();
	}
	
	public void fibo(int n) {
		for (int i = 2;i<n;i++) {
			num3 = num1+num2;
			num1 = num2;
			num2 = num3;
		}
		System.out.println(num3);
	}
	
	public void fibonacci(int n) {
		if(n>0) {
			num3 = num1+num2;
			num1 = num2;            
			num2 = num3;                //??????????????
			fibonacci(n-1);
		}
			System.out.println(num3);
	}
}