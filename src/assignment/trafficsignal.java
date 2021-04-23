package assignment;
import java.util.Scanner;
public class trafficsignal {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Choose Yellow or Green or Red");
		String color = sc.next();
		switch(color) {
		case "Red" :
			System.out.println("Stop");
		break;
		case "Yellow" :
			System.out.println("Ready");
		break;
		case "Green" :
			System.out.println("Go");
		break;	
		}
		sc.close();
	}

}
