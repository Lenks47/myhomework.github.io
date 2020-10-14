package Supermarket;

public class Test {
	public static void main(String[] args) {
		Customer cs=new Customer("张三",100);
		Cashier sc=new Cashier("李四",1014);
		cs.add(new Goods("白象方便面10口味混合",2.4,20));
		cs.add(new Goods("双汇泡面搭档2包优惠装",8.9,2));
		cs.add(new Goods("乐事薯片分享装",10.5,1));
		cs.add(new Goods("秋林格瓦斯6拼装",20.5,1));
		sc.print(cs);
	}
}
