package assignment2;
import java.util.Scanner;
public class Stringsort {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size: ");
		int size = sc.nextInt();
		System.out.println("Enter Array elements: ");
		String []array = new String[size];
		for(int i=0;i<size;i++) {
			array[i] = sc.next();
		}
		Stringsort ss = new Stringsort();
		String[]res = ss.sortString(array, size);
		for(String data:res) {
			System.out.println(data);
		}
		sc.close();
		
	}
	public String [] sortString(String array[],int size) {
		int i=0;
		String []temp = new String[size];
		for(i=0;i<size-1;i++) {
			for(int j=i+1;j<size;j++) {
				if(array[i].charAt(0) > array[j].charAt(0)) {
					temp[i] = array[j];
					array[j] = array[i];
					array[i] = temp[i];
				}
			}
		}
		if(size%2 == 0) {
			for(i=0;i<size/2;i++) {
				array[i] = array[i].toUpperCase();
			}
			array[i] = array[i].toLowerCase();
			return array;
		}
		else {
			for(i=0;i<(size/2)+1;i++) {
				array[i] = array[i].toUpperCase();
			}
			array[i] = array[i].toLowerCase();
			return array;
			
		}
	}
}
