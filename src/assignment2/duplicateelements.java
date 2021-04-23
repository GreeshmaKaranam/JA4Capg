package assignment2;
import java.util.Arrays;
import java.util.Scanner;
public class duplicateelements {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of array");
		int num = sc.nextInt();
		System.out.println("Enter array elements");
		int [] array = new int [num];
		for(int i= 0; i<array.length;i++) {
			 array[i] = sc.nextInt();
		}
		Arrays.sort(array);
	    int res = modifyArray(array,num);
		for(int i=0;i<res;i++) {
			System.out.print(array[i]+ " ");
		}
		sc.close();
	}

	
	public static int modifyArray(int array[],int num) {
		int j =0;
		int[] arr = new int[num];
		for(int i=0;i<num-1;i++) {
				if(array[i] != array[i+1])
					arr[j++] =array[i]; 
			}
		arr[j++] = array[num-1];
		for(int i=0;i<j;i++) {
			array[i]=arr[i];
		}
 		return j;
	}
}