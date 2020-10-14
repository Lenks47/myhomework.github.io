package Exp12;

public class Demo_1 {
	public static void main(String[] args) {
		Undergraduate u = new Undergraduate();
		u.setName("张三");
		u.setAge(20);
		u.setNumber("1234567890");
		u.setSchoolName("海南大学");
		u.xiangqin();
		u.deg();
		System.out.println("----------");
		Graduate g = new Graduate();
		g.setName("李四");
		g.setAge(25);
		g.setNumber("1234567890");
		g.setSchoolName("海南大学");
		g.xiangqin();
		g.deg();
	}
}
