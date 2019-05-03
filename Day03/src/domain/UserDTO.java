package domain;

public class UserDTO {
	private int productId;//user가 선택한 제품번호
	private int inserMoney;//user가 투입한 돈
	private int change;
	public UserDTO(int productId, int inserMoney, int change) {
		super();
		this.productId = productId;
		this.inserMoney = inserMoney;
		this.change = change;
	}
	public UserDTO() {
		// TODO Auto-generated constructor stub
	}
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public int getInserMoney() {
		return inserMoney;
	}
	public void setInserMoney(int inserMoney) {
		this.inserMoney = inserMoney;
	}
	public int getChange() {
		return change;
	}
	public void setChange(int change) {
		this.change = change;
	}
	
	
}
