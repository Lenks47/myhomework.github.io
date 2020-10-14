package Exp_Cpoint;

public class Person {
	private int shou;
	protected String name;
	int age;
	
	public void setShou(int a) {
		shou=a;
	}
	
	public int getShou() {
		return shou;
	}
	public void drive() {
		System.out.println("名字为："+name);
	}
	
	public void speak() {
		System.out.print("年龄："+age);
	}
	
	public void show() {
		System.out.println("手机号："+shou);
	}
}
