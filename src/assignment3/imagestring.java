package assignment3;
import java.util.*;
public class imagestring {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a word");
		String s = sc.next();
		imagestring is = new imagestring();
		System.out.println(s+"|"+is.getImage(s));
		sc.close();
	}
	
	public String getImage(String ch) {
		StringBuffer stb = new StringBuffer(ch);
		stb.reverse();
		String str = stb.toString();
		return str;
}
}
