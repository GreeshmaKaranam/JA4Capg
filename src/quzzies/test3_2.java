package quzzies;

import java.util.regex.*;

public class test3_2 {
	private static String regex = "Dog";
	private static String input = "The Dog says meow. "+"All dogs say meow";
	private static String replace = "Cat";
	public static void main(String[] args) {
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(input);
		input = m.replaceAll(replace);
		System.out.println(input);
	}
}
