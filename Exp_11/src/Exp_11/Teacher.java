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
		System.out.println("�γ̣�JAVA");
	}
	
	public void xiangqin() {
		System.out.println("ְ����"+number);
		System.out.println("����"+name);
		System.out.println("����"+age);
		System.out.println("�Ա�"+sex);
		System.out.println("�ڿΰ༶"+course);
	}
}
