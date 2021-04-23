package pack2;

public class example5 {
	//Global variables
	int a;        
	float f;
	char c;
	boolean b;
	
	public void show()
	{
		//Local Variable:(have no default value)
		int j = 10;//must be initialized
		System.out.println(j);
		System.out.println(a);//0
		System.out.println(f);//0.0
		System.out.println(c);//no default value
		System.out.println(b);//false
	}
	public static void main(String[] args) {
		example5 ex = new example5();
		ex.show();
	}

}
