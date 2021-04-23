package quzzies;
import java.util.regex.*;
public class test3_1 {
	public static void main(String[] args) {
		String input = "Hello Welcome";
		String pattern = "\\sHello\\sWelcome\\s";
		System.out.println(pattern);
		boolean flag = Pattern.matches(pattern,input);
		System.out.println(flag);
		}

}
