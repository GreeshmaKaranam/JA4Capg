package pack3;
//method overriding
class E {
	public void draw() {
		System.out.println("Circle");
	}
}
class F extends E 
{
	public void draw() {
		System.out.println("Square");
	}
}
class G extends E {
	public void draw() {
		System.out.println("Rectangle");
	}
	
}
public class hirerachy {
	public static void main(String[] args) {
		E e = new E();
		e.draw();
		E f = new F();
		f.draw();
		E g = new G();
		g.draw();
	}

}

//Method overloading - method names are same and signature is different.
/* signature means:
 * Type of arguments
 * no. of arguments
 * order of the arguments*/
//method overridding: method names are same and body is different.