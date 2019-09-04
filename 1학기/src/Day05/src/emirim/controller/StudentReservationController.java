package emirim.controller;

import emirim.domain.StudentVO;
import emirim.persistence.StudentDAO;
import emirim.view.ScoreView;

public class StudentReservationController {
	public static void main(String[] args) {
		int[] grades= {1301, 1303, 1305,1307,1309};
		String[] names = {"°­ÇýÁ¤", "±è³ªÇö", "±èÃ¤¹Î", "¹Ú±³·É", "¾öÇÏ´Ã"};
		int[] kors = {20, 40, 60, 80, 100};
		int[] engs = {10, 20, 30, 40, 50};
		int[] maths = {85, 90, 55, 40, 98};
		int[] homes = {88, 65, 77, 88, 96};
		int[] his = {22, 55, 63, 45, 75};
		
		StudentDAO dao = new StudentDAO();
		for(int i=0; i<his.length; i++) {
			dao.addStudent(new StudentVO(grades[i],names[i],kors[i],engs[i],maths[i],homes[i],his[i]) );
		}
		ScoreView view = new ScoreView();
		view.displayResult(dao);
	}
}
