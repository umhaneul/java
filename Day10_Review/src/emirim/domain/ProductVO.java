package emirim.domain;

public class ProductVO {
	private int productId;//��ǰ��ȣ
	private String productName;//��ǰ��
	private int price;//��ǰ����
	private int stockNum;//���
	
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
