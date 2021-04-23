package com.design;
import java.util.List;
import java.util.ArrayList;
class Employee {
	private final String name;
	private final String cmp;
	public Employee() {
		
	}
	public Employee getInstance(Employee obj) {
		if (obj==null) {
			Employee ojb = new Employee();
			synchronized(obj) {
				
			}
 		}
		return obj;
	}
//	class static Employee1 { //Allows static keyword for inner classes;
		
//	}
	
}
public class TestDesign1 {
	Employee emp = new Employee(); //HAS-A-Relation
	static List<String> list = new ArrayList<String>();
	public static void main(String[] args) {
		/*while(true) {
			new Thread(new Runnable() {
				public void run()
				{
					try {
						Thread.sleep(1000000000);
						}
					catch(Exception e) {
						e.printStackTrace();
					}
				}
			}
				).start();
			}*/				
		}
	}

