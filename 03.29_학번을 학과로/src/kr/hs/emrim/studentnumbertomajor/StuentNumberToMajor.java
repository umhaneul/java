package kr.hs.emrim.studentnumbertomajor;
import java.util.*;
public class StuentNumberToMajor {
	private static String[] �г�3 = {"���ͷ�Ƽ��̵���", "���ͷ�Ƽ��̵���","���̵������ΰ�"
			,"���̵������ΰ�","���̵��ַ�ǰ�","���̵��ַ�ǰ�"};
	private static String[] �г�2 = {"���̵�����Ʈ�����", "���̵�����Ʈ�����","���̵������ΰ�"
			,"���̵������ΰ�","���̵��ַ�ǰ�","���̵��ַ�ǰ�"};
	private static String[] �г�1 = {"���̵�����Ʈ�����", "���̵�����Ʈ�����","���̵������ΰ�"
			,"���̵������ΰ�","���̵��ַ�ǰ�","���̵��ַ�ǰ�"};
	public static void main(String[] args) {
		//�й��� �Է¹���
		//�а��� �������
		Scanner sc = new Scanner(System.in);
		String studentNumber =sc.next();
		
		String classroomStr = studentNumber.substring(1,2);
		int classroom = Integer.parseInt(classroomStr)-1;
		System.out.println(�г�3[classroom]);
		if(studentNumber.substring(0,1).equals("1")
			|| studentNumber.substring(1, 2).equals("2")) {
				System.out.println("���ͷ�Ƽ��̵���");
			}
		if(studentNumber.substring(0,1).equals("3")
				|| studentNumber.substring(1, 2).equals("4")) {
					System.out.println("���̵�����ַ��");
				} 
		if(studentNumber.substring(0,1).equals("5")
				|| studentNumber.substring(1, 2).equals("6")) {
					System.out.println("���̵�������");
				} else {
					
				}
		System.out.println(�г�2[classroom]);
		if(studentNumber.substring(0,1).equals("1")
			|| studentNumber.substring(1, 2).equals("2")) {
				System.out.println("���ͷ�Ƽ��̵���");
			}
		if(studentNumber.substring(0,1).equals("3")
				|| studentNumber.substring(1, 2).equals("4")) {
					System.out.println("���̵�����ַ��");
				}
		if(studentNumber.substring(0,1).equals("5")
				|| studentNumber.substring(1, 2).equals("6")) {
					System.out.println("���̵�������");
				} else {
					
				}
		System.out.println(�г�1[classroom]);
		if(studentNumber.substring(0,1).equals("1")
			|| studentNumber.substring(1, 2).equals("2")) {
				System.out.println("���ͷ�Ƽ��̵���");
			}
		if(studentNumber.substring(0,1).equals("3")
				|| studentNumber.substring(1, 2).equals("4")) {
					System.out.println("���̵�����ַ��");
				}
		if(studentNumber.substring(0,1).equals("5")
				|| studentNumber.substring(1, 2).equals("6")) {
					System.out.println("���̵�������");
				}
	}//main
}//class
