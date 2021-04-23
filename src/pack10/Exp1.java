package pack10;
import java.util.Map.Entry;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Iterator;
public class Exp1 {
	public static void main(String[] args) {
		//HASHMAP
		HashMap <String,Integer> hm = new HashMap<>();
		
		hm.put("HELLO", 5);
		hm.put("welcome", 7);
		hm.put("Everyone",8);
		hm.put("HEY", 3);
		hm.put("HELLO", 50);
		hm.put("Hola", 7);
		System.out.println(hm);
		
		//LINKEDHASHMAP
		LinkedHashMap <String,Integer> lhm = new LinkedHashMap<>();
		
		lhm.put("HELLO", 5);
		lhm.put("welcome", 7);
		lhm.put("Everyone",8);
		lhm.put("HEY", 3);
		lhm.put("HELLO", 50);
		lhm.put("Hola", 7);
		System.out.println(lhm);
		
		Iterator<Entry<String,Integer>> itr = hm.entrySet().iterator();
		while(itr.hasNext()) {
			Entry<String, Integer> et = itr.next();
			System.out.println("Key: " +et.getKey()+" Value: "+et.getValue());
		}
		
	}
//if same key is assigned with different values,
//the last given value will be assigned to key.
//It doesn't follow the input order.
}
