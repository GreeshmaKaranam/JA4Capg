package pack3;
interface inf5
{
	void disp(int x);
	
}
public class interfacefunc {
	public static void main(String[] args) {
		inf5 obj = new inf5() {
			public void disp(int x) {
				System.out.println("overriding disp");
			}
		//	public void show() {
				
			//}
		};
		obj.disp(30);
		//other method:
		new inf5() {
			public void disp(int x) {
				System.out.println("overriding disp");
			}
			//public void show() {
				
		//	}
		}.disp(30);
		//other method:
		inf5 oj = (int x) -> System.out.println("Hello this is lamda expression");
		oj.disp(20);
	}
}

