package pack12;
import java.util.List;
import java.util.stream.Collectors;
import java.util.LinkedHashMap;
import java.util.ArrayList;
class Employee {
	int empid;
	String name;
	int age;
	//default constructor
	public Employee () {
	//write code here	
	}
	public Employee(int empid, String name, int age) {
		super();
		this.empid = empid;
		this.name = name;
		this.age = age;
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
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
}
public class StreamTest1 {
	public static void main(String[] args) {
		final List<Employee> emplist = new ArrayList<Employee>();
		//List is an interface.we cannot create an object.
		Employee e = new Employee(45,"Harsha", 25);
		emplist.add(e);
		emplist.add(new Employee(12,"Bindu",19));
		emplist.add(new Employee(42,"Surya", 20));
		emplist.add(new Employee(23,"Anitha",23));
		for(final Employee emp:emplist)//for ech
		{
		//	System.out.println(emp.getEmpid()+" "+emp.getName()+" "+emp.getAge());
			if(emp.getAge()>20) {
				System.out.println(emp.getName()+" "+emp.getAge());
			}
		}
		
		//java 8 feature stream API:
	/*	 emplist.stream().filter(emp -> emp.getAge()>15).forEach(emp -> System.out.println(emp.getAge()+ " "+ emp.getName()));
		// List to Map:
		 LinkedHashMap<Integer,String> emplmp = emplist.stream()
		     .collect(Collectors.toMap(Employee :: getAge,Employee :: getName,(k,v)->k+ " "+v,LinkedHashMap :: new));
		 System.out.println(emplmp);	*/	 
	}

}
