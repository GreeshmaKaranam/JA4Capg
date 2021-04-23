package assignment3;
import java.util.*;
public class add {
	public static void main(String[] args) {
		int n;
		int sum =0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter numbers with one space gap");
		String s = sc.nextLine();  
		StringTokenizer st = new StringTokenizer(s," "); 
		while(st.hasMoreTokens()) {   // checks whether it has more tokens or not
			 String temp = st.nextToken(); //saves the next token in temp
	            n = Integer.parseInt(temp); //converts string into int
	            System.out.println(n);
	            sum = sum + n;
	        }
	        System.out.println("sum of the integers is: " + sum);
	        sc.close();
	    }
	}
