package pack4;
import java.io.FileInputStream;
import java.io.BufferedInputStream;
public class ByteRead {
	public static void main(String[] args) throws Exception{
		FileInputStream fin = new FileInputStream("src/write.txt");
		BufferedInputStream bfr = new BufferedInputStream(fin);
		byte [] br = new byte[1021];
		int x =0 ;
		while((x=bfr.read(br)) != -1) {
			System.out.println(new String(br,0,x));
		}
	}

}
