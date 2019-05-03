package emirim.inheritance;

public class Parent extends GrandParent {
	double weight;
	double height;
	
	public Parent(String name, int age, double weight, double height) {
		super(name, age);
		this.weight=weight;
		this.height=height;
		
	}

	public void play(String type) {
		System.out.println(type+"�� �ϸ鼭 �ູ�ϰ� ���.");
	}
	
	public void dance(String type) {
		System.out.println(type+"���� �ߴ�.");
	}
	
	public void talk() {
		System.out.println("�ڳ�� �ڶ��ϴ� �̾߱⸦ ������.");
	}
	
}
