package pack2;
import pack1.example4;
public class exp4 {
	example4 exp = new example4();
	public void disp()
	{
		//System.out.println(exp.o);//private
		//System.out.println(exp.p);//default
		//System.out.println(exp.q);//protected
		System.out.println(exp.r);//public
	}
}
class ex4 extends example4
{
	public void disp()
	{
		//System.out.println(o);//private
		//System.out.println(p);//default
		System.out.println(q);//protected
		System.out.println(r);//public
	}
	
}
