package emirim.bmi.gui;
public class BMICalc implements BMIInter {
	
	@Override
	public double calc(MenVO men) {
		double weight = men.getWeight();//MenVo의 체중을 반환받음
		double height = men.getHeight();//MenVo의 키를 반환 받음
		double bmi = weight/Math.pow(height/100,2);//pow는 power에 약자
		return bmi;//초기화 하여야 함
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
