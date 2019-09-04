package controller;

import java.io.PrintStream;
import java.util.Scanner;

import domain.ProductVO;
import domain.UserDTO;
import persistence.VendingDAO;
import view.VMView;

public class VMSController {

	private static PrintStream s1;

	public static void main(String[] args) {
		String[] names = {"�ݶ�","���̴�","ȯŸ","��ġ��","����"};
		int[] prices = {800, 700, 1000, 1500, 1200};
		
		VendingDAO dao = new VendingDAO();
		
		for(int i=0; i < prices.length; i++) {
			dao.addProduct(new ProductVO(i,names[i], prices[i], 10));
		}
		//view��ü�� �����ؼ� ��ǰ�������� ���
				VMView view = new VMView();
				view.displayProducts(dao.getProudctList());
				
				//UserDTO��ü�� �����ؼ� ����ڿ��� �Է� ���� ���� ����
				UserDTO user = new UserDTO();
				Scanner s1 = new Scanner(System.in);//���Աݾ�, ��ǰ����
				Scanner s2 = new Scanner(System.in);//��� ���� ����
				while(true) {
					view.inputInfo(user, s1);
					//��� ���
					view.displayResult(dao.selsectProduct(user), user);
					System.out.print("* ����ؼ� ��ǰ�� �����Ͻðڽ��ϱ�?(y/n)");
					String answer = s2.nextLine();
					if(answer.equals("n") || answer.equals("N"))
					 break;
				}
				s1.close();
				s2.close();
			}
		}