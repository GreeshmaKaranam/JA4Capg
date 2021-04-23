package pack3;
//Single level:
class A
{
	String name = "Greeshma";
	String city = "Hyd";
	public void disp() {
		System.out.println("I'm in disp method");
	}
}

class B extends A
{
	String email = "abc@gmail.com";
	String ph = "3256547";
	public void show()
	{
		System.out.println(name+" "+email+" "+ph+" "+city);
	}
	
}

class C extends B
{
	
}
class D extends C {
	
}

public class inherexp {
	public static void main(String[] args) {
		B b = new B();
		b.disp();
		b.show();
	}

}
