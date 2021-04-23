package quzzies;
interface A {
	public void method();
}
class one{
	public void method() {
		System.out.println("In class one method");
		}
}
class two extends one implements A {
	public void method() {
		System.out.println("In class two method");
		}
}
public class test5_1 {
	public static void main(String[] args) {
		A a=new two();
		a.method();
	}

}
