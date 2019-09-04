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
		System.out.println(type+"을 하면서 행복하게 놀다.");
	}
	
	public void dance(String type) {
		System.out.println(type+"춤을 추다.");
	}
	
	public void talk() {
		System.out.println("자녀들 자랑하는 이야기를 나누다.");
	}
	
}
