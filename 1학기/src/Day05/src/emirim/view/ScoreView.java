package emirim.view;

import java.util.ArrayList;

import emirim.domain.StudentVO;

import emirim.persistence.StudentDAO;

public class ScoreView {
	
	public void displayResult(StudentDAO dao) {
		ArrayList<StudentVO> studentList = dao.getList();
			System.out.println("�� ��  ���� ���α׷� �� ��");
			System.out.println();
			System.out.println("�� �й�\t �� �̸�\t �� ����\t �� ���� \t�� ���� \t�� ���� \t�� ���� \t�� ���� \t�� ���");
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
