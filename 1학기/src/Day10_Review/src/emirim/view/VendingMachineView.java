package emirim.view;

import java.util.ArrayList;
import java.util.Scanner;

import emirim.domain.ProductVO;
import emirim.domain.UserDTO;

public class VendingMachineView {
// 전체 제품을 화면에 출력
	private UserDTO user;

	public void displayProducts(ArrayList<ProductVO> productList) {
		for(ProductVO productVO : productList) {
			System.out.println("*****************************");
			System.out.println(" "+productVO.getProductId()+"."+productVO.getProductName()+"]](￦ "+productVO.getPrice()+") ||");
			System.out.println("*****************************");
	    }
	}
	
	public void inputInfo(UserDTO user, Scanner s1) {
		System.out.println("====== 돈을 투입한 후 제품을 선택하세요. ======");
		System.out.println("1. ￦1000, 2. ￦2000, 3. ￦3000");
		System.out.println("☞돈 투입: ");
		int moneyId = s1.nextInt();
		user.setInserMoney(moneyId*1000);
		System.out.println("제품 선택: (제품번호 입력):");
		int productId = s1.nextInt();
		
		user.setProductId(productId);		
	}
	
	public void displayResult(ProductVO product, UserDTO user) {
		//재고량 제크
		int stockNum = product.getStockNum();
		if(stockNum > 0) {
			product.setStockNum(stockNum--);
			
			if(product.getPrice() > user.getInserMoney()) {
				System.out.println("!! 투입 금액이 부족합니다.");
				System.out.println("투입했던 ￦"+user.getInserMoney()+"가 반환되었습니다.");
			}
			System.out.println(product.getProductName()+"이 나왔습니다.");
			int change = user.getInserMoney()-product.getPrice();
			user.setChange(change);
			System.out.println("잔돈이 ￦"+change+"입니다.");
		} else {
			System.out.println("현재 제품은 매진되었습니다.");
			System.out.println("투입했던 ￦"+user.getInserMoney()+"가 반환되었습니다.");
		}
	}
	
	
}

