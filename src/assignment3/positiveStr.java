package assignment3;
import java.util.Scanner;
public class positiveStr {
	int count = 0;
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a word");
	String s = sc.next();
	positiveStr ps = new positiveStr();
	System.out.println(ps.CheckString(s.toCharArray()));
	sc.close();
}
	public boolean CheckString(char [] ch) {
		for(int i=0;i<ch.length-1;i++) {
			if(ch[i]<ch[i+1]) {
				count++;
			}
		}
		if(count == ch.length-1) {
			return true;
		}
		else
			return false;
		
	}
}
