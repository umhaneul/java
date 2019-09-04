package emirim.tv;

public class TV {
	private String productCompany;
	private int channel;
	private int volume;
	private boolean power;
	private String color;
	
	public static void main(String[] args) {
	String[] name= {"삼성","이철호","신혜정"};
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
		System.out.println("현재볼륨:"+volume);
	}
	
	public void upChannel() {
		if(channel < 500)
			channel++;
		else channel=0;
		System.out.println("현재 채널:"+channel);
	}
	
	public void downChannel() {
		if(channel > 0)
			channel--;
		System.out.println("현재 채널:"+channel);
	}
	
	public void powerOn() {
		power=true;
		System.out.println("전원이 커졌습니다.");
	}
	
	public void powerOff() {
		power=false;
		System.out.println("전원이 꺼졌습니다.");
	}
	
	public void showInfo() {
		System.out.println("♬♬♬♬♬♬♬♬♬♬♬♬♬♬♬♬♬♬♬♬♬♬♬");
		System.out.println("♬♬♬제조사: "+productCompany);
		System.out.println("♬♬♬색상: "+color);
		System.out.println("♬♬♬채널: "+channel);
		System.out.println("♬♬♬볼륨: "+volume);
		System.out.println("♬♬♬전원 상태: "+power);
	
	}
	
}
