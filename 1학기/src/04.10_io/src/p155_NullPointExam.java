
public class p155_NullPointExam {

	public static void main(String[] args) {
		String str = null;
		try {
			
		System.out.println("���ڿ� : "+str.length());
		}catch(NullPointerException e) {
			System.out.println("�Ұ���");
			System.out.println(e.toString());
			e.printStackTrace();
		}
		System.out.println("�Ϸ�");
	}

}
