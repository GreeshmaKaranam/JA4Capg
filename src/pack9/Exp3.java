package pack9;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.Iterator;
public class Exp3 {
	public static void main(String[] args) {
		//HashSet:doesn't take duplicate values.
		//will not follow the input order.
		Set hs = new HashSet();
		hs.add("java");
		hs.add(10);
		hs.add('A');
		hs.add(34.56f);
		hs.add(34.768);
		hs.add(false);
		hs.add("Hello");
		hs.add(10);
		System.out.println(hs);
		
		//LinkedHashSet follows input order
		//It doesn't allow duplicates.
		Set hs1 = new LinkedHashSet();
		hs1.add("java");
		hs1.add(10);
		hs1.add('A');
		hs1.add(34.56f);
		hs1.add(34.768);
		hs1.add(false);
		hs1.add("Hello");
		hs1.add(10);
		System.out.println(hs1);
		
		Iterator itr = hs.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}

		
	}
}
