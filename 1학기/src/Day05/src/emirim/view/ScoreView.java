package emirim.view;

import java.util.ArrayList;

import emirim.domain.StudentVO;

import emirim.persistence.StudentDAO;

public class ScoreView {
	
	public void displayResult(StudentDAO dao) {
		ArrayList<StudentVO> studentList = dao.getList();
			System.out.println("※ ※  성적 프로그램 ※ ※");
			System.out.println();
			System.out.println("▶ 학번\t ▶ 이름\t ▶ 국어\t ▶ 영어 \t▶ 수학 \t▶ 가정 \t▶ 국사 \t▶ 총점 \t▶ 평균");
			for(StudentVO studentVO : studentList) {
				System.out.printf("  %d   ",studentVO.getGrade());
				System.out.printf("%s    ",studentVO.getName());
				System.out.printf("%d    ",studentVO.getKor());
				System.out.printf("%d    ",studentVO.getEng());
				System.out.printf("%d     ",studentVO.getMath());
				System.out.printf("%d    ",studentVO.getHome());
				System.out.printf("%d    ",studentVO.getHis());
				System.out.printf("%d    ",studentVO.getSum());
				System.out.printf("%s    ",studentVO.getAverage());
				System.out.println();
		}
		
	}
	
}
