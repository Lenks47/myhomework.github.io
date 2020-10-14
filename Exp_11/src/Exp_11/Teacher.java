package Exp_11;

public class Teacher {
	private String number;
	String name;
	int age;
	String sex;
	String course;
	public Teacher() {
		
	}
	public Teacher(String name, int age, String sex, String course) {
		this.name = name;
		this.age = age;
		this.sex = sex;
		this.course = course;
	}
	
	public String getNumber() {
		return number;
	}
	
	public void setNumber(String number) {
		this.number = number;
	}
	
	public void teach() {
		System.out.println("课程：JAVA");
	}
	
	public void xiangqin() {
		System.out.println("职工号"+number);
		System.out.println("姓名"+name);
		System.out.println("年龄"+age);
		System.out.println("性别"+sex);
		System.out.println("授课班级"+course);
	}
}
