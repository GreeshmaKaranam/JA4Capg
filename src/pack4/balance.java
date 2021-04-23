package pack4;
import java.util.Scanner;
public class balance {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter existing balance:");
		int avl = sc.nextInt();
		System.out.println("Enter credited amount:");
		int crd = sc.nextInt();
/*		String avl = "3000";
		String crd = "2000";
		System.out.println("Total bal:" +(avl+crd));//30002000 since they are declared as strings
		                                            //they will concatenate but not add;
		
		double n_avl = Double.parseDouble(avl);
		double n_crd = Double.parseDouble(crd);
		
		System.out.println("Total bal:" +(n_avl+n_crd));//5000.0	*/
		System.out.println("Total bal: " +(avl+crd));
		sc.close();
	}

	
}
