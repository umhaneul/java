package emirim.view;

import java.util.ArrayList;
import java.util.Scanner;

import emirim.domain.ProductVO;
import emirim.domain.UserDTO;

public class VendingMachineView {
// ��ü ��ǰ�� ȭ�鿡 ���
	private UserDTO user;

	public void displayProducts(ArrayList<ProductVO> productList) {
		for(ProductVO productVO : productList) {
			System.out.println("*****************************");
			System.out.println(" "+productVO.getProductId()+"."+productVO.getProductName()+"]](�� "+productVO.getPrice()+") ||");
			System.out.println("*****************************");
	    }
	}
	
	public void inputInfo(UserDTO user, Scanner s1) {
		System.out.println("====== ���� ������ �� ��ǰ�� �����ϼ���. ======");
		System.out.println("1. ��1000, 2. ��2000, 3. ��3000");
		System.out.println("�ѵ� ����: ");
		int moneyId = s1.nextInt();
		user.setInserMoney(moneyId*1000);
		System.out.println("��ǰ ����: (��ǰ��ȣ �Է�):");
		int productId = s1.nextInt();
		
		user.setProductId(productId);		
	}
	
	public void displayResult(ProductVO product, UserDTO user) {
		//��� ��ũ
		int stockNum = product.getStockNum();
		if(stockNum > 0) {
			product.setStockNum(stockNum--);
			
			if(product.getPrice() > user.getInserMoney()) {
				System.out.println("!! ���� �ݾ��� �����մϴ�.");
				System.out.println("�����ߴ� ��"+user.getInserMoney()+"�� ��ȯ�Ǿ����ϴ�.");
			}
			System.out.println(product.getProductName()+"�� ���Խ��ϴ�.");
			int change = user.getInserMoney()-product.getPrice();
			user.setChange(change);
			System.out.println("�ܵ��� ��"+change+"�Դϴ�.");
		} else {
			System.out.println("���� ��ǰ�� �����Ǿ����ϴ�.");
			System.out.println("�����ߴ� ��"+user.getInserMoney()+"�� ��ȯ�Ǿ����ϴ�.");
		}
	}
	
	
}

