package Exp12;

public class Stu {
	private String name;
	private int age;
	protected String number;
	String schoolName;
	
	public Stu() {
		
	}

	public Stu(String name, int age, String number, String schoolName) {
		super();
		this.name = name;
		this.age = age;
		this.number = number;
		this.schoolName = schoolName;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getSchoolName() {
		return schoolName;
	}
	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}
	
	public void xiangqin() {
		System.out.println("����"+name);
		System.out.println("����"+age);
		System.out.println("ѧ��"+number);
		System.out.println("�Ͷ���ѧ"+schoolName);
	}
}
