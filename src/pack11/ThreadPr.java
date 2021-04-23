package pack11;
class Exp2 extends Thread {
	public void run() {
		try {
			for(int  i = 1;i<=10;i++) {
				System.out.println(i);
				Thread.sleep(1000);//produces delay for 1sec;
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
	}
}
public class ThreadPr extends Thread {
	public void run() {
		try {
			for(int  i = 1;i<=10;i++) {
				System.out.println(i);
				Thread.sleep(1000);//produces delay for 1sec;
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	public static void main(String[] args) {
		Exp2 t1 = new Exp2();
		Exp2 t2 = new Exp2();
		Exp2 t3 = new Exp2();
		Exp2 t4 = new Exp2();

	//	t1.start();
		//get and set thread name
		System.out.println("Default name of t1: "+ t1.getName());//thread-0
		System.out.println("Default name of t2: " +t2.getName());//thread-1
		System.out.println("Default name of t3: " +t3.getName());//thread-2
		System.out.println("Default name of t4: " +t4.getName());//thread-3
		t1.setName("Math");
		//get and set priority
		System.out.println("After setting new nameto t1:" +t1.getName());
	    System.out.println("Default tread priority of t1: "+t1.getPriority());//5
	    System.out.println("Default tread priority of t2: "+t2.getPriority());//5
	    System.out.println("Default tread priority of t3: "+t3.getPriority());//5
	    System.out.println("Default tread priority of t4: "+t4.getPriority());//5
	    t1.setPriority(MIN_PRIORITY);
	    t2.setPriority(NORM_PRIORITY);
	    t3.setPriority(MAX_PRIORITY);
	    System.out.println("After setting tread priority of t1: "+t1.getPriority());
	    System.out.println("After setting tread priority of t2: "+t2.getPriority());
	    System.out.println("After setting tread priority of t3: "+t3.getPriority());

	}
}
