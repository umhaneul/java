import java.io.IOException;
import java.util.Scanner;

public class IOprogram {
	public static void main(String[] args) {
//		Scanner scanner = new Scanner(System.in);
//		String inputString = scanner.nextLine();
//		System.out.println(inputString);
//		System.err.println(inputString);
		
		int bt;
		try {
			while((bt = System.in.read()) != 'x') {
				System.out.println((char)bt);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
