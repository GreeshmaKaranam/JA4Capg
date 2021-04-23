package assignment3;
import java.util.*;
public class replaceconsonants {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a word");
		String s = sc.next();
		replaceconsonants rc = new replaceconsonants();
		System.out.println(rc.alterString(s.toCharArray())); //convert string into character array and sends to method.
		sc.close();
}
	public boolean isVowel(char ch) {
		if(ch!='a'&&ch!='e'&&ch!='i'&&ch!='o'&&ch!='u'&&ch!='A'&&ch!='E'&&ch!='I'&&ch!='O'&&ch!='U') {
			return false;
		}
		return true;
}
	public String alterString(char[] ch) { //accepts input in the form of array of characters.
		for(int i =0;i<ch.length;i++) {
			if(!isVowel(ch[i])) {
				if(ch[i]=='z') {
					ch[i] = 'b';
				}
				else
					ch[i] =(char) (ch[i]+1);
			}
		}
		return String.valueOf(ch);
	}
}
			