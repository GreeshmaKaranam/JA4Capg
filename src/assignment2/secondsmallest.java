package assignment2;
import java.util.Scanner;
import java.util.Arrays;
public class secondsmallest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of array");
		int n = sc.nextInt();
		int []ar = new int[n];
		System.out.println("Enter array elements");
		for(int i=0;i<n;i++) {
			ar[i] = sc.nextInt();
		}
		secondsmallest ss = new secondsmallest();
		System.out.println("The second smallest element is: "+ss.getSecondSmallest(ar));
		System.out.println("The second smallest element is: "+ss.getsecondsmallest(ar));
		sc.close();
	}
	//using function:
	public int getSecondSmallest(int [] ar) {
		Arrays.sort(ar);
		for(int i=0;i<ar.length;i++) {
			System.out.println(ar[i]);
		}
		return ar[1];
		}
	//without function:
    public int getsecondsmallest(int []ar) {
    	int max = 0;
    	for(int i=0;i<ar.length;i++) {
    		for(int j=i+1;j<ar.length;j++) {
    			if(ar[i] > ar[j]) {
    				max = ar[i];
    				ar[i] = ar[j];
    				ar[j] = max;
    			}
    		}
    		System.out.println(ar[i]);           
    	}
    	return ar[1];
    }
}

