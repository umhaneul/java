package emirim.controller;

import java.util.ArrayList;

import emirim.teacher.Teacher;

public class teacherController {

		public static void main(String[] args) {
			String[] names= {"±è¿µÃ¶","ÀÌÃ¶È£","½ÅÇýÁ¤"};
			int[] ages= {35, 40, 43};
			String[] hairColors= {"black", "yellow", "brown"};
			double[] heights= {175.3, 179.7, 165};
			int[] footsizes = {270, 280, 240};
			
			ArrayList<Teacher> teacherList = new ArrayList<>();
			
			for (int i = 0; i < footsizes.length; i++) {
				Teacher teacher = new Teacher();
				teacher.setName(names[i]);
				teacher.setHairColor(hairColors [i]);
				teacher.setAge(ages [i]);
				teacher.setHeight(heights [i]);
				teacher.setFootsize(footsizes [i]);
				teacherList.add(teacher);
			}
			for (Teacher teacher : teacherList) {
				teacher.showInfo();
				teacher.sleep();
				teacher.eat();
				teacher.teach();
				teacher.watchingTV();
				
			}
			
		}
}
