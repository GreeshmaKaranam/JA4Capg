package pack3;
interface inf1 {
	void add();
	void sub();
}
abstract class Abs1 {
	public void details() {
		System.out.println("Normal method in abstract class");
	}
	public abstract void hello();
}

class clas extends Abs1 implements inf1 {
	public void add() {
		System.out.println("The numbers are added");
	}
	public void sub() {
		System.out.println("The numbers are substracted");
	}
	public void hello() {
		System.out.println("HELLO");
	}
	
}
public class interfaces1 {
	public static void main(String[] args) {
		clas c = new clas();
		c.add();
		c.sub();
		c.hello();
		c.details();
	}

}
