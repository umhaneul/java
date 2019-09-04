package helloworld;
import java.util.*;
public class helloworld {
	public static void main(String[] args) {
//		int member = 7;
//		//if문으로 member가 5이면, itzy 출력
//		//if문으로 member가 7이면, BTS 출력
//		//if문으로 member가 9이면, EXO 출력
//		//if문으로 member가 1이면, IU 출력
//		//if문으로 member가 13이면, Seventeen 출력
//		if(member==5) {
//		System.out.println("itzy");
//		}
//		
//		else if(member==7) {
//			System.out.println("BTS");
//		}
//		else if(member==9) {
//			System.out.println("EXO");
//		}
//		
//		else if(member==1) {
//			System.out.println("IU");
//		}
//		else if(member==13) {
//			System.out.println("seventeen");
//		}
//		//switch문
//		switch(member) {
//		case 1: System.out.println("itzy"); break;
//		case 2: System.out.println("EXO"); break;
//		case 3: System.out.println("BTS"); break;
//		case 4: System.out.println("IU"); break;
//		case 5: System.out.println("seventeen"); break;
//		}
//		System.out.println("-------------------");
		//반복문
		//구구단 2단 출력
//		for(int i=1; i<10; i++) {
//			System.out.println(2+"x"+i+"="+ 2* i);
//		}
//		int i=1;
//		while(i<10) {
//			System.out.println(2+"x"+i+"="+ 2* i);
//			i++;
//		}
		/*int arr[] = new int[] {5,7,9,1,13};
		for(int a: arr) {
			System.out.println(a+"");
		}
		System.out.println("------------------------");
		//입력받자
*/		
		//while(true) {
//		for(;;) {
//			System.out.println("멤버수를 입력하세요.");
//			Scanner sc=new Scanner(System.in);
//			int member = sc.nextInt();
//			
//			if(member==5) {
//				System.out.println("itzy");
//				}
//				
//				else if(member==7) {
//					System.out.println("BTS");
//				}
//				else if(member==9) {
//					System.out.println("EXO");
//				}
//				
//				else if(member==1) {
//					System.out.println("IU");
//				}
//				else if(member==13) {
//					System.out.println("seventeen");
//				}
//				else {
//					System.out.println("탈출");
//					break;
//				}
//		}
		
		System.out.println("----");
		//번호를 입력하면, 우리반 학생 이름을 출력하자
		
		String[] 반4 = {"강은서","곽가연","김민지","김봄이","김소현","김채민","남정윤","박서연","서혜림","신채린","양수빈","엄하늘","원채연","윤수빈","임태희","전은정","정유경","함지현"} ;
		
//		for(int i=0; i<반4.length; i++) {
//			System.out.println(반4[i]);
//		}
		for(String name:반4) {
			System.out.println(name);
		}
		//입력하자
//		Scanner scanner = new Scanner(System.in);
//		while(true) {
//			System.out.println("번호를 입력하세요. 이름을 알려드립니다.");
//			//-----
//		int number = scanner.nextInt();
//		
//
//		//1<=number<=18
//		if(1<=number && number<=반4.length) {
//		//출력하자
//		System.out.println(반4[number-1]);
//		
//		}
//	}//		Scanner sc=new Scanner(System.in);
//		while(true) {
//		System.out.println("학번을 입력해 주세요.");
//		int member = sc.nextInt();
//		switch(member) {
//		case 1: System.out.println("강은서"); break;
//		case 2: System.out.println("곽가연"); break;
//		case 3: System.out.println("김민지"); break;
//		case 4: System.out.println("김봄이"); break;
//		case 5: System.out.println("김소현"); break;
//		case 6: System.out.println("김채민"); break;
//		case 7: System.out.println("남정윤"); break;
//		case 8: System.out.println("박서연"); break;
//		case 9: System.out.println("서혜림"); break;
//		case 10: System.out.println("신채린"); break;
//		case 11: System.out.println("양수빈"); break;
//		case 12: System.out.println("엄하늘"); break;
//		case 13: System.out.println("원채연"); break;
//		case 14: System.out.println("윤수빈"); break;
//		case 15: System.out.println("임태희"); break;
//		case 16: System.out.println("전은정"); break;
//		case 17: System.out.println("정유경"); break;
//		case 18: System.out.println("함지현"); break;
//		
//			}
//			if(member>=19) {
//				break;
//			}
	}
		}