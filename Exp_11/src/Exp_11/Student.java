package Exp_11;

public class Student {
	String number;
	String name;
	int age;
	String sex;
	private String ph;
	
	public void setPh(String ph) {
		this.ph=ph;
	}
	
	public String getPh(){
		return ph;
	}
	
	public Student() {
		
	}
	
	public Student(String number,String name,int age,String sex) {
		this.number=number;
		this.name=name;
		this.age=age;
		this.sex=sex;
		
	}
	
	public void denlu() {
		System.out.println("登录:"+number);
	}
	
	public void jiaofei() {
		System.out.println("缴费已成功");
	}
	
	public void xiangqin() {
		System.out.println("学号"+number);
		System.out.println("姓名"+name);
		System.out.println("年龄"+age);
		System.out.println("性别"+sex);
		System.out.println("电话"+ph);
	}
}
