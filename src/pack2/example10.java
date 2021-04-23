package pack2;
//Arrays:
public class example10 {
	public static void main(String[] args) {
		int ar[] = {12,13,14,15};
		for(int z:ar) {
			System.out.println(z);
		}
		String name = "Karanam";
		StringBuffer sb = new StringBuffer(name);
		sb.reverse();
		System.out.println(sb);
		for(int i = name.length()-1;i>=0;i--) {
			System.out.println(name.charAt(i));
		}
	}

}
