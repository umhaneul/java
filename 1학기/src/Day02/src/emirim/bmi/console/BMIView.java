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
		System.out.println("*** BMI 정보 입력 ***");
		System.out.print("* 성명: ");
		String name=s1.nextLine();
		System.out.print("* 체중(kg): ");
		double weight=s2.nextDouble();
		System.out.print("* 신장(cm): ");
		double height=s2.nextDouble();
		men.setName(name);
		men.setWeight(weight);
		men.setHeight(height);
		s1.close();
		s2.close();
		
	}
	
	public void showInfo() {
		System.out.println("♣♣♣♣♣ BMI 결과지 ♣♣♣♣♣");
		System.out.printf("♣ %s님의 BMI 지수는 %d(㎏/㎥)입니다.\n",men.getName(), Math.round(bmi));
		System.out.println("♣ "+men.getName()+"님의 BMI 지수는"+Math.round(bmi)+"(㎏/㎥)");
		System.out.println("♣ 따라서 귀하의 체중은 "+resultCom+"체중입니다.");
	}
	
}
