import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class ����ó�� {
	static ArrayList<����> ������ = new ArrayList<>();
	
	public static void main(String[] args) {
		//���Ͽ�������
//		FileReader fr;
//		try {
//			fr = new FileReader("src/writed.txt");
//			//���ۿ�������
//			BufferedReader br = new BufferedReader(fr);
//			//�ݺ�, ���� ����
//			String line;
//			while((line = br.readLine()) != null) { //�̸�\t�ּ�\t����\t����
//				StringTokenizer st = new StringTokenizer(line, "\t");
//				//�� ��ü ���� ����
//				���� new���� = new ����();
//				new����.setName(st.nextToken());
//				new����.setAddress(st.nextToken());
//				new����.setMath(Double.parseDouble(st.nextToken()));
//				new����.setEnglish(Double.parseDouble(st.nextToken()));
//				//����Ʈ�� ������� �� ��ü ����
//				������.add(new����);
//				//����Ʈ �������
//				for(���� a : ������) {
//					System.out.println(a);
//				}
//				//���Ϸ� ��������
//				
//				//���Ͽ�������
//				FileWriter fw = new FileWriter("src/save.txt");
//				//���� ��������
//				BufferedWriter bw = new BufferedWriter(fw);
//				//����
//				for(���� a : ������) {
//					bw.write(a.getName() + "\t" + a.getAddress() + "\t" + a.getMath() + "\t" + a.getEnglish() + "\t" + a.getTotal() + "\t" + a.getAverage());
//					bw.newLine();
//				}
//				//����
//				br.close();
//				bw.close();
//				fr.close();
//				fw.close();
//		} catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		catch (NumberFormatException e) {
//			e.printStackTrace();
//		}
//		catch (IOException e) {
//			e.printStackTrace();
		}
}
