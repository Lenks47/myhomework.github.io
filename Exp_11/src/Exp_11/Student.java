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
		System.out.println("��¼:"+number);
	}
	
	public void jiaofei() {
		System.out.println("�ɷ��ѳɹ�");
	}
	
	public void xiangqin() {
		System.out.println("ѧ��"+number);
		System.out.println("����"+name);
		System.out.println("����"+age);
		System.out.println("�Ա�"+sex);
		System.out.println("�绰"+ph);
	}
}
