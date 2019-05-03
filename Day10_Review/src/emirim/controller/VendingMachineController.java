package emirim.controller;

import java.util.Scanner;

import emirim.domain.ProductVO;
import emirim.domain.UserDTO;
import emirim.persistence.VendingMachineDAO;
import emirim.view.VendingMachineView;

public class VendingMachineController {

	public static void main(String[] args) {
		String[] productNames= {"����ƾ��", "�̶���", "��ī������Ʈ", "��ġ��", "�ݶ�"};
		int[] productpries = {1500, 1200, 900, 1300, 700};
		VendingMachineDAO dao = new VendingMachineDAO();
		
		for(int i=0; i<productpries.length; i++) {
			dao.addProduct(new ProductVO(i, productNames[i], productpries[i], 10));
		}
		
		UserDTO user = new UserDTO();
		Scanner s1 = new Scanner(System.in);
		Scanner s2 = new Scanner(System.in);
		
		VendingMachineView view = new VendingMachineView();
		
		view.displayProducts(dao.getProductList());
		
		while(true) {
			view.inputInfo(user, s1);
			view.displayResult(dao.selectedProduct(user), user);
			System.out.println("�� ��� ��ǰ�� �����Ͻðڽ��ϱ�?(y/n");
			String answer = s2.nextLine();
			
		}
	}
}
