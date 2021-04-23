package pack9;
import java.util.TreeSet;
import java.util.LinkedHashSet;
import java.util.Set;
public class Exp4 {
	public static void main(String[] args) {
		//TreeSet
		//<String> - generic;
		//allows only one format of data
		Set<String> ts = new TreeSet<String>();;
		ts.add("Java");
		ts.add("People");
		ts.add("Greek");
		ts.add("Tamil");
		ts.add("Welcome");
		ts.add("World");
		ts.add("Hello");
		ts.add("Hey");
		System.out.println(ts);
		//contains:to check whether the value is present or not in the set.
		//the value should be of same data type as input.
		System.out.println(ts.contains("Heart"));//true
	}
}
