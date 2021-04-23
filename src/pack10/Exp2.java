package pack10;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.TreeMap;
public class Exp2 {
	//TREEMAP
	public static void main(String[] args) {
		TreeMap<String,Integer> tm = new TreeMap<>();
		
		tm.put("HELLO", 5);
		tm.put("welcome", 7);
		tm.put("Everyone",8);
		tm.put("HEY", 3);
		tm.put("HELLO", 50);
		tm.put("Hola", 7);
		System.out.println(tm);
		Iterator<Entry<String,Integer>> itr = tm.entrySet().iterator();
		while(itr.hasNext()) {
			Entry<String, Integer> et = itr.next();
			System.out.println("String: " +et.getKey()+" Value: "+et.getValue());
		}
	}
}