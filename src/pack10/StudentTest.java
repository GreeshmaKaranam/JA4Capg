package pack10;
import java.util.ArrayList;
import java.util.Collections;
public class StudentTest {
	public static void main(String[] args) {
		ArrayList<Student> stdlist = new ArrayList<Student>();
		
		stdlist.add(new Student(223,"Rakesh",14));
		stdlist.add(new Student(145,"Suresh",23));
		stdlist.add(new Student(135,"Suren",22));
		//         or
		Student std = new Student(234, "Raghu", 15);
		stdlist.add(std);
		
		Collections.sort(stdlist);
		for(Student stdl:stdlist) {
			System.out.println("Std Rollnum: "+stdl.getRollnum()+ "  Std Name: "+stdl.getName()+"  Std Age: "+stdl.getAge());
		}
		
		NameCompare namecmp = new NameCompare();
		Collections.sort(stdlist,namecmp);
		for(Student stdl:stdlist) {
			System.out.println("Std Rollnum: "+stdl.getRollnum()+ "  Std Name: "+stdl.getName()+"  Std Age: "+stdl.getAge());
		}
	}

}
