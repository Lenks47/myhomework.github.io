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
		System.out.println("����Ϊ��"+name);
	}
	
	public void speak() {
		System.out.print("���䣺"+age);
	}
	
	public void show() {
		System.out.println("�ֻ��ţ�"+shou);
	}
}
