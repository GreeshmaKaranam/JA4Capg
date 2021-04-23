package assignment2;
import java.util.Scanner;
import java.util.Arrays;
public class ReverseSort {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of array");
		int num = sc.nextInt();
		System.out.println("Enter array elements");
		int [] array = new int [num];
		for(int i= 0; i<array.length;i++) {
			 array[i] = sc.nextInt();
		}
		int []res = getSorted(array,num);
		System.out.println("Sorted Array:");
		for(int data:res) {
			System.out.println(data);
		}
		sc.close();
	}
	public static int[] getSorted(int array[],int num) {
		for(int i=0;i<num;i++) {
			array[i] = reverse(array[i]);
			System.out.println(array[i]);
		}
		Arrays.sort(array);
		return array;
	}		
	public static int reverse(int num) {
			int rev =0 ;
			while(num!=0) {
				rev = (rev*10) + num%10;
				num = num/10;
			}
			return rev;
		}
}