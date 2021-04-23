package pack11;
class Exp1 extends Thread {
	public void run() {
		try {
			Thread.sleep(1000);
			System.out.println("I'm in run method");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
}
}
public class LifeCycle {
	public static void main(String[]  args) throws Exception {
		Exp1 t1 = new Exp1();
		System.out.println("Before starting thread state:" +t1.getState());
		System.out.println("Before starting thread status:" +t1.isAlive());
		t1.start();
		System.out.println("After starting thread state:" +t1.getState());
		System.out.println("After starting thread status:" +t1.isAlive());
		Thread.sleep(1000);
		System.out.println("In sleep thread state:" +t1.getState());
		System.out.println("In sleep thread status:" +t1.isAlive());
		t1.join();
		System.out.println("After joining thread state:" +t1.getState());
		System.out.println("After joining thread status:" +t1.isAlive());
	}

}
