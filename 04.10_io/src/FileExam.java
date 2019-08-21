import java.io.FileReader;
import java.io.FileWriter;

public class FileExam {

	public static void main(String[] args) {
		try {
		char buffer[] = new char[100];
		FileReader fr = new FileReader("src/datar.txt");
		FileWriter fw = new FileWriter("src/dataw.txt");
		fr.read(buffer, 0, buffer.length);
		String str = new String(buffer);
		System.out.println(str);
		fw.write(buffer);
		fw.flush();
		fw.close();

	} catch(Exception e) {
		e.printStackTrace();
	}

}
}
