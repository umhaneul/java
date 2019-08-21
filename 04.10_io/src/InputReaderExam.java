import java.io.IOException;
import java.io.InputStreamReader;

public class InputReaderExam {

	public static void main(String[] args) {
		InputStreamReader reader = new InputStreamReader(System.in);
	while(true) {
		int i;
		try {
			i = reader.read();
			if(i == -1) break;	//Ctrl+z �̸��� �� = �극��ũ
			char c = (char)i;
			System.out.print(c);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	System.out.println();
	}

}
