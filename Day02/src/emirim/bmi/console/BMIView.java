package emirim.bmi.console;

import java.util.Scanner;

public class BMIView {
	private MenVO men;
	private double bmi;
	private String resultCom;
	

	public BMIView(MenVO men) {
		super();
		this.men = men;
	}

	public double getBmi() {
		return bmi;
	}

	public void setBmi(double bmi) {
		this.bmi = bmi;
	}

	public String getResultCom() {
		return resultCom;
	}

	public void setResultCom(String resultCom) {
		this.resultCom = resultCom;
	}

	public void inputInfo() {
		Scanner s1 = new Scanner(System.in);
		Scanner s2 = new Scanner(System.in);
		System.out.println("*** BMI ���� �Է� ***");
		System.out.print("* ����: ");
		String name=s1.nextLine();
		System.out.print("* ü��(kg): ");
		double weight=s2.nextDouble();
		System.out.print("* ����(cm): ");
		double height=s2.nextDouble();
		men.setName(name);
		men.setWeight(weight);
		men.setHeight(height);
		s1.close();
		s2.close();
		
	}
	
	public void showInfo() {
		System.out.println("���������� BMI ����� ����������");
		System.out.printf("�� %s���� BMI ������ %d(��/��)�Դϴ�.\n",men.getName(), Math.round(bmi));
		System.out.println("�� "+men.getName()+"���� BMI ������"+Math.round(bmi)+"(��/��)");
		System.out.println("�� ���� ������ ü���� "+resultCom+"ü���Դϴ�.");
	}
	
}
