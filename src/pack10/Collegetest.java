package pack10;
import java.util.Map;
import java.util.HashMap;
public class Collegetest {
	public static void main(String[] args) {
		college cg1 = new college("Hello",56);
		college cg2 = new college("Hello",56);
		
		Map<college, String>hm = new HashMap<>();
		hm.put(cg1, "data1");
		hm.put(cg2,"data2");
		//System.out.println(hm);
		for(college cg:hm.keySet()) {
			System.out.println(hm.get(cg).toString());
		}
	}
}
