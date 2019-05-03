package emirim.controller;

import emirim.bmi.console.BMICalc;
import emirim.bmi.console.BMIView;
import emirim.bmi.console.MenVO;

public class BMIController {

	public static void main(String[] args) {
		MenVO men = new MenVO();
		BMIView view = new BMIView(men);
		view.inputInfo();
		BMICalc cal = new BMICalc();
		double bmi = cal.calc(men);
		String com = cal.resultPath(bmi);
		view.setBmi(bmi);
		view.setResultCom(com);
		view.showInfo();
	}

}
