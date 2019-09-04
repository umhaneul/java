import java.util.*;
public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String line;
		String tmpStr = "hong 용산구 105 20.5";
		StringTokenizer parse = new StringTokenizer(tmpStr);
		String name;
		String address;
		double math;
		double english;
		double total;
		double avg;
		name = parse.nextToken();
		address = parse.nextToken();
		math = Double.valueOf(parse.nextToken()).doubleValue(); //String ->Double ->double
		english = Double.valueOf(parse.nextToken()).doubleValue(); //String -> c
		total = math +english;
		avg = total/2.0;
		System.out.println(name + "\t" + address + "\t" + math + "\t" + english + "\t" + total + "\t" + avg);
		//String.split()
		String[] arrStr = tmpStr.split(" ");
		for(String str : arrStr) {
			System.out.println(str+"\t");
		}
	}

}
