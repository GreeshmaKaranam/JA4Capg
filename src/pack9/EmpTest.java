package pack9;
import java.util.ArrayList;
import java.util.List;
public class EmpTest {
	public static void main(String[] args) {
		List<Employee> emplist = new ArrayList<Employee>();
		Employee e1 = new Employee();
		e1.setid(3432);
		e1.setname("Arun");
		e1.setcmp("TSSP");
		
		Employee e2 = new Employee();
		e2.setid(3453);
		e2.setname("Arjun");
		e2.setcmp("TGRSP");
		
		emplist.add(e1);
		emplist.add(e2);
		
		EmpDao edao = new EmpDao();
		edao.addEmp(emplist);
	
		List<Employee> emp = edao.listAll();
		for(Employee e:emp) {
			System.out.println("Emp ID: "+e.getid()+" Emp Name: "+ e.getname()+" Emp cmp: "+e.getcmp());
	}
		}
	

}
