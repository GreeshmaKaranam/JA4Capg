package pack3;
interface inf2 {
	void mul();
	interface inf3
	{
		void div();
	}
}

class clas1 implements inf2.inf3 {
	public void mul() {
		System.out.println("Multiplication");
	}
	public void div() {
		System.out.println("Division");
	}
}
public class innerinf {
	public static void main(String[] args) {
		clas1 c1 = new clas1();
		c1.mul();
		c1.div();
	}
}
