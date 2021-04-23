package pack9;

public class Employee {
	private int id;
	private String name;
	private String cmp;
	public int getid() {
		return id;
	}
	public void setid(int id) {
		this.id = id;
	}
	public String getname() {
		return name;
	}
	public void setname(String name) {
		this.name = name;
	}
	public String getcmp() {
		return cmp;
	}
	public void setcmp(String cmp) {
		this.cmp = cmp;
	}
	//Employee emp = new Employee();
	public void disp() {
		System.out.println("Emp ID: "+id+" Emp Name: "+name+" Emp cmp: "+cmp);
	}

}
