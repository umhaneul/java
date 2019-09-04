package emirim.view;

import java.util.ArrayList;

import emirim.domain.ProductVO;
import emirim.domain.UserDTO;

public class VMView {
	public void displayProducts(ArrayList<ProductVO> productList) {
		System.out.println("**************************************");
		for(ProductVO productVO : productList) {
			System.out.println(" "+productVO.getProductId()+ ". [["
					+productVO.getProductName()+"]] (\""
					+productVO.getPrice()+") || ");
		}
		System.out.println("/n************************************");
	}
	
	public void displayResult(ProductVO product, UserDTO user) {
		
	}
}
