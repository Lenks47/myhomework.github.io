package jiekou_2;

public class Demo_2 {
	public static void main(String args[]) {
		Teacher t = new Teacher();
		Chinese c = new Chinese();
		Math m = new Math();
		t.setName("张三");
		t.setAge(35);
		t.XQ();
		c.KC();
		c.ZY();
		t.setName("李四");
		t.setAge(40);
		t.XQ();
		m.KC();
		m.ZY();
	}
}
