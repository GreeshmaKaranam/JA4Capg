package pack11;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
public class ConcurTest  extends Thread {
	//static ArrayList al = new ArrayList();
	
	static CopyOnWriteArrayList al = new CopyOnWriteArrayList();
	public void run() {
		try {
			Thread.sleep(1000);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		al.add("People");
	}
	public static void main(String[] args) throws Exception {
		al.add("HEY");
		al.add("Hello");
		al.add("Hola");
		al.add("Heya");
		al.add("Hii");
		ConcurTest t = new ConcurTest();
		t.start();
		Iterator it = al.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
			Thread.sleep(2000);
		}
	}
}
