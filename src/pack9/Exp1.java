package pack9;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.LinkedList;

import pack9.Test;
public class Exp1 {
	public static void main(String[] args) {
		int x = 10;
	//	String[] ar = {12,34,"Java"};//we cannot store numbers in a string array.
	
	//so to store values of different data types, we can use collections
		Test t = new Test();
		List list = new ArrayList();
		list.add("java");
		list.add(10);
		list.add('A');
		list.add(34.56f);
		list.add(34.768);
		list.add(false);
		list.add(t);
		list.add("Hello");
		list.add(10);
		System.out.println(list);
		
		
		List list1 = new LinkedList();
		list1.add("java");
		list1.add(10);
		list1.add('A');
		list1.add(34.56f);
		list1.add(34.768);
		list1.add(false);
		list1.add(t);
		list1.add("Hello");
		list1.add(10);
		System.out.println(list1);
		
		ListIterator ltr = list.listIterator();
		while(ltr.hasNext()) {
			System.out.println(ltr.next());
		}
		while(ltr.hasPrevious()) {
			System.out.println(ltr.previous());
		}
	}
}