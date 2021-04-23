package quzzies;
abstract class demo {
	public int a;
	demo() {
		a = 10;
	}
	abstract public void set();
//	abstract final public void get(); abstract methods cannot be declared final
}

/*public class test5_2 extends demo{
	public void set(int a) {
		this.a = a;
	}
/*	final public void get() {         // method declared as final cannot be accessed.
		System.out.println("A=" +a);
	}*/
	/*public static void main(String[] args) {
		test5_2 obj = new test5_2();
		obj.set(20);
	//	obj.get();
	}

}*/
