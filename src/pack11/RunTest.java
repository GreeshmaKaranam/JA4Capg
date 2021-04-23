package pack11;
class Add {
	public void cal(int a, int b) {
		System.out.println(a+b);
	}
}
class Math {
	public void mul() {
		System.out.println(20*30);
	}
}
class Bank implements Runnable {
	@Override
	public void run() {
		try {
			System.out.println("I'm from run method(): "+Thread.currentThread().getName());
		/*	Add ad = new Add();
			ad.cal(10,45);
			Thread.sleep(1000);
			Math m = new Math();
			m.mul();*/
		}
		catch(Exception e) {
			System.out.println("Exception in thread");
		}
	}
}
public class RunTest {
	public static void main(String[] args) {
		Bank t1 = new Bank();
		//t1.start(),t1.join() // gives error here.
		//converting runnable interface object into thread class object.
		
		//now we can use all thread class methods.

		ThreadGroup tg1 = new  ThreadGroup("Bank");
		Thread t3 = new Thread(tg1,t1,"Credit");
		Thread t4 = new Thread(tg1,t1,"Withdraw");
		Thread t5 = new Thread(tg1,t1,"Transfer");

		ThreadGroup tg2 = new  ThreadGroup("Math");
		Thread t6 = new Thread(tg2,t1,"Add");
		Thread t7 = new Thread(tg2,t1,"Sub");
		Thread t8 = new Thread(tg2,t1,"Mul");

		
	//	t2.start();
	//	System.out.println(t2.getName());
		t4.start();
		t5.start();
		System.out.println("Bank group active threads:"+tg1.activeCount());
		t6.start();
		t7.start();
		System.out.println("Math group active threads:"+tg1.activeCount());

	
	}
}
