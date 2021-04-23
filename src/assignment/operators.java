package assignment;
public class operators {		
	int num = 263; 
	public void cube() {
		int sum=0;
		while(num != 0) {
			int rem = num % 10;
			sum = sum +(rem*rem*rem);
			num = num /10;
		}
		System.out.println(sum);
	}
	public static void main(String[] args) {
		operators op = new operators();
		op.cube();
	}	
}

