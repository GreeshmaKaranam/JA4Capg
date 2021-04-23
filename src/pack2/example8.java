package pack2;
//Regular expressions:
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class example8 {
	public static void main(String[] args) {
		Pattern ptr = Pattern.compile(".s..");
		Matcher mtr = ptr.matcher("pspj");
		boolean cnd = mtr.matches();//true(since the position s in both are matching)
		System.out.println(cnd);
		boolean  cnd1 = Pattern.compile("..j").matcher("ej").matches();
		System.out.println(cnd1);//false(since position of j is not matching);
	    System .out.println(Pattern.matches("[a-zA-Z0-9]*{8}", "aBC1j8y2d11"));
	    System .out.println(Pattern.matches("[abc]*", "ababc"));

//14- gives true when there are 8 characters including alphabets or numbers
	//if we want to enter more then 8 characters, we need to add a '+' before 8 (+{8});	    

	}

}
