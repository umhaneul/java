package emirim.tv;

public class TV {
	private String productCompany;
	private int channel;
	private int volume;
	private boolean power;
	private String color;
	
	public static void main(String[] args) {
	String[] name= {"�Ｚ","��öȣ","������"};
	int[] channel= {150};
	int[] volume= {189};
	double[] power= {500};
	String[] color = {"balck"};
	}
	
	public TV(String productCompany, int channel, int volume, boolean power, String color) {
		super();
		this.productCompany = productCompany;
		this.channel = channel;
		this.volume = volume;
		this.power = power;
		this.color = color;
	}
	
	public String getProductCompany() {
		return productCompany;
	}
	public void setProductCompany(String productCompany) {
		this.productCompany = productCompany;
	}
	public int getChannel() {
		return channel;
	}
	public void setChannel(int channel) {
		this.channel = channel;
	}
	public int getVolume() {
		return volume;
	}
	public void setVolume(int volume) {
		this.volume = volume;
	}
	public boolean isPower() {
		return power;
	}
	public void setPower(boolean power) {
		this.power = power;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	public void upVolume() {
		if(volume < 100)
			volume++;
		else
			volume=0;
		System.out.println("���纼��:"+volume);
	}
	
	public void upChannel() {
		if(channel < 500)
			channel++;
		else channel=0;
		System.out.println("���� ä��:"+channel);
	}
	
	public void downChannel() {
		if(channel > 0)
			channel--;
		System.out.println("���� ä��:"+channel);
	}
	
	public void powerOn() {
		power=true;
		System.out.println("������ Ŀ�����ϴ�.");
	}
	
	public void powerOff() {
		power=false;
		System.out.println("������ �������ϴ�.");
	}
	
	public void showInfo() {
		System.out.println("�ݢݢݢݢݢݢݢݢݢݢݢݢݢݢݢݢݢݢݢݢݢݢ�");
		System.out.println("�ݢݢ�������: "+productCompany);
		System.out.println("�ݢݢݻ���: "+color);
		System.out.println("�ݢݢ�ä��: "+channel);
		System.out.println("�ݢݢݺ���: "+volume);
		System.out.println("�ݢݢ����� ����: "+power);
	
	}
	
}
