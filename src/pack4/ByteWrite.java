package pack4;
//Files
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
public class ByteWrite {
	public static void main(String[] args)throws Exception {
		File f = new File("src/write.txt");
		FileOutputStream fout = new FileOutputStream(f);
		String msg = "Hello this is file handling example using byte stream";
		fout.write(msg.getBytes());
		System.out.println("Done..");
	}

}
