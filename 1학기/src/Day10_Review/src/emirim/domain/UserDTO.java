package emirim.domain;

public class UserDTO {
	
	
	private int productId;//����ڰ� ������ ��ǰ��ȣ
	private int inserMoney;//����ڰ� ������ ��
	private int change;//��ȯ��
	
	public UserDTO() {
	}
	
	public UserDTO(int productId, int inserMoney, int change) {
		super();
		this.productId = productId;
		this.inserMoney = inserMoney;
		this.change = change;
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

	@Override
	public String toString() {
		return "UserDTO [productId=" + productId + ", inserMoney=" + inserMoney + ", change=" + change + "]";
	}
	
	
}
