package Exp12;

public class Demo_1 {
	public static void main(String[] args) {
		Undergraduate u = new Undergraduate();
		u.setName("����");
		u.setAge(20);
		u.setNumber("1234567890");
		u.setSchoolName("���ϴ�ѧ");
		u.xiangqin();
		u.deg();
		System.out.println("----------");
		Graduate g = new Graduate();
		g.setName("����");
		g.setAge(25);
		g.setNumber("1234567890");
		g.setSchoolName("���ϴ�ѧ");
		g.xiangqin();
		g.deg();
	}
}
