package pack3;
class A1 {
	public void add(int num1,int num2) {
		System.out.println(num1+num2);
	}
	
	public void add(int num1,double num2) {
		System.out.println(num1+num2);
	}
	public void add(int num1,int num2,int num3) {
		System.out.println(num1+num2+num3);
	}
	
	
}
public class methodoverloading {
	public static void main(String[] args) {
		A1 a = new A1();
		a.add(10, 20);
		a.add(20,34.56);
		a.add(10, 20,45);
	}

}
