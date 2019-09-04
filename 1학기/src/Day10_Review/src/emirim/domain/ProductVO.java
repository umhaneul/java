package emirim.domain;

public class ProductVO {
	private int productId;//제품번호
	private String productName;//제품명
	private int price;//제품가격
	private int stockNum;//재고량
	
	public ProductVO() {
		// TODO Auto-generated constructor stub
	}
	
	
	public ProductVO(int productId, String productName, int price, int stockNum) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.price = price;
		this.stockNum = stockNum;
	}


	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getStockNum() {
		return stockNum;
	}
	public void setStockNum(int stockNum) {
		this.stockNum = stockNum;
	}


	@Override
	public String toString() {
		return "ProductVO [productId=" + productId + ", productName=" + productName + ", price=" + price + ", stockNum="
				+ stockNum + "]";
	}


	public String getName() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
