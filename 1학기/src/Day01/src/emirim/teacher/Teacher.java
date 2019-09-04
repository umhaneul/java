package emirim.teacher;

import java.util.concurrent.SynchronousQueue;

public class Teacher {
	private String name;
	private int footsize;
	private int age;
	private String hairColor;
	private double height;
	
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getFootsize() {
		return footsize;
	}

	public void setFootsize(int footsize) {
		this.footsize = footsize;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getHairColor() {
		return hairColor;
	}

	public void setHairColor(String hairColor) {
		this.hairColor = hairColor;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public void teach() {
		System.out.println(name+"선생님이 학생들을 가르치신다.");
	}
	
	public void sleep() {
		System.out.println(name+"선생님께서 주무신다.");
	}
	
	public void eat() {
		System.out.println(name+"선생님께서 삼겹살을 드신다.");
	}
	
	public void watchingTV() {
		System.out.println(name+"선생님께서 보여줘 엑소를 보신다.");
	}
	
	public void developeCode() {
		System.out.println(name+"선생님께서 모두의 마블을 개발하신다.");
	}

	public void showInfo() {
		System.out.println("*******************************");
		System.out.println("** 성명:"+name);
		System.out.println("** 신발사이즈:"+footsize);
		System.out.println("** 머리색:"+hairColor);
		System.out.println("** 나이:"+age+"세");
		System.out.println("** 키:"+height+"cm");
		System.out.println("*******************************");
	}
	
	@Override
	public String toString() {
		return "Teacher [name=" + name + ", footsize=" + footsize + ", age=" + age + ", hairColor=" + hairColor
				+ ", height=" + height + "]";
	}
	
	
}