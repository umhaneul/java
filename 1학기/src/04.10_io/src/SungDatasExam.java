import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

//금천구 100.0 100.0 
//양천구 100.0 100.0
//광주 북구 70.0 80.0
//관악구 30.0 20.8

public class SungDatasExam {

	public static void main(String[] args) {
//		//파일연결하자 writed.txt
//		try { 
//		
//		FileReader fr = new FileReader(//writed.txt);
//		//버퍼연결하자 (readLine() 하기 위해서)
//		BufferedReader br = new BufferedReader(fr);
//		//한 줄 읽고, /t로 연결하자
//		String csvStr = " "; //모든내용 /t로 연결한 String
//		String tmpStr = ""; // 한줄일기용 임시 String
//		while((tmpStr = br.readLine()) != null) {
//			csvStr += tmpStr +"/t";
//		}
//		//token으로 나누어 데이터 저장하자
//		//total, avg 계산하자
//		StringTokenizer parse = new StringTokenizer(csvStr, "/t");
//		int length = parse.countTokens() / 4;
//		String[] name = new String[length];
//		String[] address = new String[length];
//		double[] math = new double[length];
//		double[] english = new double[length];
//		double[] total = new double[length];
//		double[] avg = new double[length];
//		for(int i =0; i<length; i++) {
//			name[i] = parse.nextToken();
//			address[i] = parse.nextToken();
//			math[i] = Double.parseDouble(parse.nextToken());
//			english[i] = Double.parseDouble(parse.nextToken());
//			total[i] = math[i] + english[i];
//			avg[i] = total[i] / 2;
//		}
//				//출력하자
//		//0~<length
//		for(int i = 0; i < length; i++) {
//		System.out.println("이름 : "+name[i]+", 주소:"+address[i]
//						+", 수학" + math[i]+", 영어:"+english[i]
//						+", 총점 : " + total[i] + ", 평균 : " + avg[i]);
//		}
//	} catch (FileNotFoundException e) {
//		e.printStackTrace();
//			
//		}catch (IOException e) {
//			e.printStackTrace();
//		}
	}
	}
