package domain;

public class ProductVO {
	private int productId;
	private String name;//��ǰ��
	private int price;//����
	private int stockNum;//�米��
	
	public ProductVO() {
	
	}
	
	public ProductVO(int productId,String name, int price, int stockNum) {
		super();
		this.productId = productId;
		this.name = name;
		this.price = price;
		this.stockNum = stockNum;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}


	
}
