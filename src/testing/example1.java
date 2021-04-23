package testing;

public class example1
{
	public static void main(String[] args) {
		
		//OPERATORS:
		//++,--
		int i=0;
		System.out.println(i++); //0, i=1
		System.out.println(++i);//1+1=2
		System.out.println(--i);//2-1=1
		System.out.println(i--);//1
		
		//+ - / * %
		int x = 10;
		int y =20;
		System.out.println(x+y);//30
		System.out.println(x-y);//-10
		System.out.println(y/x);//2
		System.out.println(x/2);//5
		System.out.println(y/5);//4
		System.out.println(x*y);//200
		System.out.println((x%5)==0);//true
	}
}
