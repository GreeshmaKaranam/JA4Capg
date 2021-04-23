package quzzies;
class superclass {
	int b = 10;
	private superclass() {
		this.b = 7;
	}
	int f() {
		return b;
	}
 }
/*class subclass extends superclass { //error
	int b;
}
public class test4_2 {

}*/
//implicit super constructor superclass() is undefined for default constructor.
//must define explicit constructor.
