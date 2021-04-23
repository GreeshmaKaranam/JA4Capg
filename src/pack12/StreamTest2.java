package pack12;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.HashMap;
import java.util.LinkedHashMap;
//import java.

class Employees {
	int empid;
	String name;
	int  Age;
	public Employees(int empid, String name, int age) {
		super();
		this.empid = empid;
		this.name = name;
		Age = age;
	}
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return Age;
	}
	public void setAge(int age) {
		Age = age;
	}
}
public class StreamTest2 {
	public static void main(String[] args) {
		List<Employees> emplist = new ArrayList<Employees>();
		//List is an interface.we cannot create an object.
		Employees e = new Employees(45,"Harsha", 25);
		emplist.add(e);
		emplist.add(new Employees(12,"Bindu",19));
		emplist.add(new Employees(42,"Surya", 20));
		emplist.add(new Employees(23,"Anitha",23));
		Map<Integer,String> emphm = new HashMap<Integer,String>();
		//converting list to map:
		for(Employees emp:emplist) {
			emphm.put(emp.getAge(), emp.getName());
		}
		System.out.println(emphm);
		
		//java 8 features converting list to map
		LinkedHashMap<Integer, String> lmap = emplist.stream()
				.collect(Collectors.toMap(Employees :: getAge, Employees ::getName,(k,v)->k+" "+v,LinkedHashMap::new));
		lmap.forEach((k,v) -> System.out.println("Age: "+k+" Name:"+v));
	
		//converting Map data to collection data
		//Integer format data:
		List<Integer> mtoc = emphm.entrySet().stream().map(k -> k.getKey()).collect
				(Collectors.toList());
		mtoc.forEach(System.out::println);
		//String format Data:
		List<String> smtoc = emphm.entrySet().stream().map(v -> v.getValue()).collect
				(Collectors.toList());
		smtoc.forEach(System.out::println);
	}

}
