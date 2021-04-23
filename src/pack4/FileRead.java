package pack4;
import java.io.FileReader;
import java.io.BufferedReader;
public class FileRead {
	public static void main(String[] args) throws Exception{
		FileReader fr = new FileReader("src/abc.txt");
		BufferedReader br = new BufferedReader(fr);
		System.out.println(br.readLine());
	}

}
