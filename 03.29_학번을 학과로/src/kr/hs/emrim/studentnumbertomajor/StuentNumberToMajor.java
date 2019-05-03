package kr.hs.emrim.studentnumbertomajor;
import java.util.*;
public class StuentNumberToMajor {
	private static String[] 학년3 = {"인터랙티브미디어과", "인터랙티브미디어과","뉴미디어디자인과"
			,"뉴미디어디자인과","뉴미디어솔루션과","뉴미디어솔루션과"};
	private static String[] 학년2 = {"뉴미디어소프트웨어과", "뉴미디어소프트웨어과","뉴미디어디자인과"
			,"뉴미디어디자인과","뉴미디어솔루션과","뉴미디어솔루션과"};
	private static String[] 학년1 = {"뉴미디어소프트웨어과", "뉴미디어소프트웨어과","뉴미디어디자인과"
			,"뉴미디어디자인과","뉴미디어솔루션과","뉴미디어솔루션과"};
	public static void main(String[] args) {
		//학번을 입력받자
		//학과를 출력하자
		Scanner sc = new Scanner(System.in);
		String studentNumber =sc.next();
		
		String classroomStr = studentNumber.substring(1,2);
		int classroom = Integer.parseInt(classroomStr)-1;
		System.out.println(학년3[classroom]);
		if(studentNumber.substring(0,1).equals("1")
			|| studentNumber.substring(1, 2).equals("2")) {
				System.out.println("인터랙티브미디어과");
			}
		if(studentNumber.substring(0,1).equals("3")
				|| studentNumber.substring(1, 2).equals("4")) {
					System.out.println("뉴미디어웹솔루션");
				} 
		if(studentNumber.substring(0,1).equals("5")
				|| studentNumber.substring(1, 2).equals("6")) {
					System.out.println("뉴미디어디자인");
				} else {
					
				}
		System.out.println(학년2[classroom]);
		if(studentNumber.substring(0,1).equals("1")
			|| studentNumber.substring(1, 2).equals("2")) {
				System.out.println("인터랙티브미디어과");
			}
		if(studentNumber.substring(0,1).equals("3")
				|| studentNumber.substring(1, 2).equals("4")) {
					System.out.println("뉴미디어웹솔루션");
				}
		if(studentNumber.substring(0,1).equals("5")
				|| studentNumber.substring(1, 2).equals("6")) {
					System.out.println("뉴미디어디자인");
				} else {
					
				}
		System.out.println(학년1[classroom]);
		if(studentNumber.substring(0,1).equals("1")
			|| studentNumber.substring(1, 2).equals("2")) {
				System.out.println("인터랙티브미디어과");
			}
		if(studentNumber.substring(0,1).equals("3")
				|| studentNumber.substring(1, 2).equals("4")) {
					System.out.println("뉴미디어웹솔루션");
				}
		if(studentNumber.substring(0,1).equals("5")
				|| studentNumber.substring(1, 2).equals("6")) {
					System.out.println("뉴미디어디자인");
				}
	}//main
}//class
