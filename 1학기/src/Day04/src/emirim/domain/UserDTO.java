package emirim.domain;

public class UserDTO {
	private int pay;//����ڰ� �����ϴ� �ݾ�
	private int selectedMovieId;//����ڰ� ������ ��ȭ Id
	
	public void UserDIO() {
		
	}
	
	public UserDTO() {
		super();
		this.pay = pay;
		this.selectedMovieId = selectedMovieId;
	}

	public int getPay() {
		return pay;
	}
	public void setPay(int pay) {
		this.pay = pay;
	}
	public int getSelectedMovieId() {
		return selectedMovieId;
	}
	public void setSelectedMovieId(int selectedMovieId) {
		this.selectedMovieId = selectedMovieId;
	}
	
	
}
