package emirim.inheritance;

public class GrandParent {
	public String name;
	public int age;
	
	public GrandParent(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	public void sleep(int time) {
		System.out.println(time+"�ð� �ڴ�.");
	}
	public void eat(String food) {
		System.out.println(food+"�� �Դ�");
	}
}
