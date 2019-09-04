package emirim.domain;

public class StudentVO {
	private int grade;
	private String name;
	private int Kor, Eng, Math, Home, His;
	private int sum;
	private int average;
	
	public StudentVO() {
		
	}
	public StudentVO(int grade, String name, int kor, int eng, int math, int home, int his) {
		super();
		this.grade = grade;
		this.name = name;
		this.Kor = kor;
		this.Eng = eng;
		this.Math = math;
		this.Home = home;
		this.His = his;

	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getKor() {
		return Kor;
	}
	public void setKor(int kor) {
		Kor = kor;
	}
	public int getEng() {
		return Eng;
	}
	public void setEng(int eng) {
		Eng = eng;
	}
	public int getMath() {
		return Math;
	}
	public void setMath(int math) {
		Math = math;
	}
	public int getHome() {
		return Home;
	}
	public void setHome(int home) {
		Home = home;
	}
	public int getHis() {
		return His;
	}
	public void setHis(int his) {
		His = his;
	}
	public int getSum() {
		sum = Kor+Eng+Math+Home+His;
		return sum;
	}
	public void setSum(int sum) {
		
		this.sum = sum;
	}
	public int getAverage() {
		average = sum/5;
		return average;
	}
	public void setAverage(int average) {
		this.average = average;
	}
	
	
	
}

