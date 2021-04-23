package pack4;
import java.io.FileWriter;
public class FileWrite {
	public static void main(String[] args) throws Exception {
		FileWriter fw = new FileWriter("src/abc.txt");
		String msg = "this is file write example using filewriter class";
		fw.write(msg);
		fw.flush();
		System.out.println("Done..");
	}

}
