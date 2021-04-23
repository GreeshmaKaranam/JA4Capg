package pack3;

interface inf{
	
	int p = 123;
	void mthd1();
	default void mthd2() {
		System.out.println("default method mthd2() in interface");
	}
	static void mthd3() {
		System.out.println("static method mthd3() in interface");	//it can't participate in inheritance	
	}
}

abstract class Absc implements inf
{
	public abstract void disp();
	public void show() {
		System.out.println("method show() in abstract class");
	}
}

class absimp extends Absc 
{
	public  void mthd1() 
	{
		System.out.println("overriding mthd1()");
	}
	public void disp() 
	
	{
		System.out.println("overriding disp()");
	}
}
public class interfaces {
	public static void main(String[] args) {
		absimp ai = new absimp();
		ai.mthd1();
		ai.disp();
		ai.mthd2();
		ai.show();
	}
}
