package pack2;

public class example6 {
	public static void main(String[] args) {
		//java bulit-in libraries example(String)
		String str = "Karanam";
		String str1 = "Karanam";
		String ch = "Greeshma";
		String str2 = new String("Karanam");
		String str3 = new String("Karanam");
		System.out.println(str==str1);//true
		System.out.println(str1==str2);//false
		System.out.println(str2==str3);//false
		System.out.println(str==str3);//false
		System.out.println(str1.equals(str3));//true
		System.out.println(str1==ch);//false
		System.out.println("\n\n");
		System.out.println(str.hashCode());
		System.out.println(str1.hashCode());
		System.out.println(ch.hashCode());
		System.out.println(str2.hashCode());
		System.out.println(str3.hashCode());
	}

}
