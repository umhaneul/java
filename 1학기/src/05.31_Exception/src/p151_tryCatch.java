
public class p151_tryCatch {
	public static void main(String[] args) {
		String[] irum = new String[3];
		irum[0] = "��ä��";
		irum[1] = "��ä��";
		irum[2] = "������";
		try {
			for(int i = 0; i<=irum.length; i++) {
				System.out.println(i);
			}
		} catch(ArrayIndexOutOfBoundsException e) { //catch���� �ϳ��� ������ ��
			System.out.println("���� �߻�");
			e.printStackTrace();
		} catch(Exception e) {
			System.out.println("�ͼ���");
		} finally {
			System.out.println("������ ���� �˴ϴ�.");
		}
	}
}
