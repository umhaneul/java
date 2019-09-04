package emirim.controller;
import java.util.ArrayList;
import java.util.Scanner;

import emirim.inheritance.Child;

public class ChlidController {

	public static void main(String[] args) {
		Scanner s1 = new Scanner(System.in);
		Scanner s2 = new Scanner(System.in);
		ArrayList<Child> cList = new ArrayList<Child>();
		while(true) {
			System.out.println("**************************");
			System.out.println("�� �ڳ��� ������ �Է��� �ּ���.");
			System.out.print("�� ����: ");
			String name = s1.nextLine();
			System.out.println("�� ����: ");
			int age = s2.nextInt();
			System.out.println("�� ü��: ");
			int weight = s2.nextInt();
			System.out.println("�� Ű: ");
			double height = s2.nextDouble();
			System.out.println("�� �б���: ");
			String schoolName = s1.nextLine();
			System.out.println("**************************");
			System.out.println("�� �Է��� ����Ͻðڽ��ϱ�?(y/n)");
			String end  = s1.nextLine();
			if(end.equals("n") || end.equals("N"))
				break;
			
			Child c = new Child(name, age, weight, height, schoolName);
			cList.add(c);
		}
		
		for(Child child : cList) {
			System.out.println(child.name+"�Դϴ�.");
			System.out.println(child.age+"���Դϴ�.");
			child.dance("���ô�");
			child.play("���Ǿ�");
		}
		
		s1.close();
		s2.close();
		
	}

}
