package quzzies;
class superclass1 {
	int b = 10;
}
class subclass extends superclass1 {
	int b = 20;
}
public class test4_4 {
	public static void main(String[] args) {
		superclass1 obj = new subclass();
		System.out.println(obj.b);
		superclass1 obj1 = new superclass1();
		System.out.println(obj.b);
		subclass sbc = new subclass();
		System.out.println(sbc.b);
	}

}
