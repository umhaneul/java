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
		System.out.println(name+"�������� �л����� ����ġ�Ŵ�.");
	}
	
	public void sleep() {
		System.out.println(name+"�����Բ��� �ֹ��Ŵ�.");
	}
	
	public void eat() {
		System.out.println(name+"�����Բ��� ������ ��Ŵ�.");
	}
	
	public void watchingTV() {
		System.out.println(name+"�����Բ��� ������ ���Ҹ� ���Ŵ�.");
	}
	
	public void developeCode() {
		System.out.println(name+"�����Բ��� ����� ������ �����ϽŴ�.");
	}

	public void showInfo() {
		System.out.println("*******************************");
		System.out.println("** ����:"+name);
		System.out.println("** �Ź߻�����:"+footsize);
		System.out.println("** �Ӹ���:"+hairColor);
		System.out.println("** ����:"+age+"��");
		System.out.println("** Ű:"+height+"cm");
		System.out.println("*******************************");
	}
	
	@Override
	public String toString() {
		return "Teacher [name=" + name + ", footsize=" + footsize + ", age=" + age + ", hairColor=" + hairColor
				+ ", height=" + height + "]";
	}
	
	
}