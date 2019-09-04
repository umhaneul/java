package persistence;

import java.util.ArrayList;

import domain.ProductVO;
import domain.UserDTO;

public class VendingDAO {
	
		private ArrayList<ProductVO> productList = new ArrayList<ProductVO>();
		
		public void addProduct(ProductVO product) {
			productList.add(product);
		}
	public ProductVO selsectProduct(UserDTO user) {
		
		return productList.get(user.getProductId());
	}
	public ArrayList<ProductVO> getProudctList() {
		return productList;
	}
}
