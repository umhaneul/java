package emirim.bmi.gui;
public class BMICalc implements BMIInter {
	
	@Override
	public double calc(MenVO men) {
		double weight = men.getWeight();//MenVo�� ü���� ��ȯ����
		double height = men.getHeight();//MenVo�� Ű�� ��ȯ ����
		double bmi = weight/Math.pow(height/100,2);//pow�� power�� ����
		return bmi;//�ʱ�ȭ �Ͽ��� ��
	}

	@Override
	public String resultCom(double bmi) {
		String result="";
		if(bmi<18.5)
			result="bmi1";
		else if(bmi<25)
			result="bmi2";
		else if(bmi<30)
			result="bmi3";
		else
			result="bmi4";
		return result;
	}


}
