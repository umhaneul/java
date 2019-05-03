package emirim.inheritance;

public class Child extends Parent {
	public String schoolName;

	public Child(String name, int age, double weight, double height, String schoolName) {
		super(name, age, weight, height);
		this.schoolName = schoolName;
	}
	
	public void study(String subject) {
		System.out.println(subject+"를(을) 열심히 공부하다.");
	}
	
	public void dance(String type) {
		System.out.println(type + "춤을 열정적으로 춘다.");
	}
	
}
