import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

//��õ�� 100.0 100.0 
//��õ�� 100.0 100.0
//���� �ϱ� 70.0 80.0
//���Ǳ� 30.0 20.8

public class SungDatasExam {

	public static void main(String[] args) {
//		//���Ͽ������� writed.txt
//		try { 
//		
//		FileReader fr = new FileReader(//writed.txt);
//		//���ۿ������� (readLine() �ϱ� ���ؼ�)
//		BufferedReader br = new BufferedReader(fr);
//		//�� �� �а�, /t�� ��������
//		String csvStr = " "; //��系�� /t�� ������ String
//		String tmpStr = ""; // �����ϱ�� �ӽ� String
//		while((tmpStr = br.readLine()) != null) {
//			csvStr += tmpStr +"/t";
//		}
//		//token���� ������ ������ ��������
//		//total, avg �������
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
//				//�������
//		//0~<length
//		for(int i = 0; i < length; i++) {
//		System.out.println("�̸� : "+name[i]+", �ּ�:"+address[i]
//						+", ����" + math[i]+", ����:"+english[i]
//						+", ���� : " + total[i] + ", ��� : " + avg[i]);
//		}
//	} catch (FileNotFoundException e) {
//		e.printStackTrace();
//			
//		}catch (IOException e) {
//			e.printStackTrace();
//		}
	}
	}
