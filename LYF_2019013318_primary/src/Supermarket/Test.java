package Supermarket;

public class Test {
	public static void main(String[] args) {
		Customer cs=new Customer("����",100);
		Cashier sc=new Cashier("����",1014);
		cs.add(new Goods("���󷽱���10��ζ���",2.4,20));
		cs.add(new Goods("˫������2���Ż�װ",8.9,2));
		cs.add(new Goods("������Ƭ����װ",10.5,1));
		cs.add(new Goods("���ָ���˹6ƴװ",20.5,1));
		sc.print(cs);
	}
}
