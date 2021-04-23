package pack10;

public class college {
	String name;
	int id;
	
	public college(String name, int id) {
		this.id = id;
		this.name = name;
	}
	@Override
	public boolean equals(Object obj) {
		if(this == obj)
			return true;
		
		if(obj == null || obj.getClass() != this.getClass())
			return false;
		
		college cg =  (college) obj;
		return (cg.name.equals(this.name) && cg.id == this.id);
	}
	
/*	@Override
	public int hashCode() {
		return this.id;
	}*/

}
