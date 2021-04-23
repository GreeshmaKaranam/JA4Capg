package pack10;
import java.util.Comparator;
public class Student implements Comparable<Student>{
	private int rollnum;
	private String Name;
	private int age;
	@Override
	public int compareTo(Student std) {
		return this.rollnum-std.rollnum;//'-' indicates sorting;
	}
	
	
	public Student(int rollnum, String name, int age) {
		this.rollnum = rollnum;
		this.Name = name;
		this.age = age;
	}
	
	
	public int getRollnum() {
		return rollnum;
	}
	public void setRollnum(int rollnum) {
		this.rollnum = rollnum;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}	
}
class NameCompare implements Comparator<Student>
{
	@Override
	public int compare(Student std1,Student std2) {
		return std1.getName().compareTo(std2.getName());
	}
}