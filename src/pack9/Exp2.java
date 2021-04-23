package pack9;
import java.util.Stack;
public class Exp2 {
	public static void main(String[] args) {
		Stack sk = new Stack();
		sk.add("java");
		sk.add(10);
		sk.add('A');
		sk.add(34.56f);
		sk.add(34.768);
		sk.add(false);
		sk.add("Hello");
		sk.add(10);
		System.out.println(sk);
		//peek
		System.out.println(sk.peek());//10
		//push:adds element at the top
		sk.push("TDD");
		System.out.println(sk);
		System.out.println(sk.peek());//TDD
		//pop:Removes the top element
		sk.pop();
		System.out.println(sk);
		//Search:gives positive if num is present else negative.
		System.out.println(sk.search(100));
		System.out.println(sk.empty());//gives boolean o/p
	}

}
