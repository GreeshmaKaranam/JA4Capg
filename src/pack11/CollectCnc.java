package pack11;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.ArrayList;

public class CollectCnc {
	public static void main(String[] args) {
	//	ArrayList al = new ArrayList();
	    CopyOnWriteArrayList al = new CopyOnWriteArrayList();
		al.add("HEY");
		al.add("Hello");
		al.add("Hola");
		al.add("Heya");
		al.add("Hii");
		Iterator itr = al.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
			al.add("Hiee");
		}
	}
}
