package pack1;

public class example4 {
	private int o=10;
	int p = 20;
	protected int q = 30;
	public int r = 50;
	public void disp() {
		System.out.println(o);
		System.out.println(p);
		System.out.println(q);
		System.out.println(r);
	}
	public static void main (String[] args) {
		example4 exp = new example4();
		exp.disp();
	}
}

class exmp4 extends example4 
{
	public void disp()
	{
	//	System.out.println(o);
		System.out.println(p);
		System.out.println(q);
		System.out.println(r);	
	}
	public static void main (String[] args) {
		exmp4 ex = new exmp4();
		ex.disp();
	}
	
}
