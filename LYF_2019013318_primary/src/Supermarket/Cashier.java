package Supermarket;

import java.text.DecimalFormat;

public class Cashier {
	private String n;
	private double m;
	DecimalFormat df=new DecimalFormat("#.00");
	public Cashier(String n,double m) {
		this.m=m;
		this.n=n;
	}
	public String getN() {
		return n;
	}
	public void setN(String n) {
		this.n = n;
	}
	public double getM() {
		return m;
	}
	public void setM(double m) {
		this.m = m;
	}
	public void print(Customer cs)
	{
		ShoppingCar sc=cs.getSc();
		System.out.println("��ӡƾ��");
		System.out.println("�˿�:"+cs.getCn());
		System.out.println("����:"+this.n);
		System.out.println("��Ʒ����"+"������������������������"+"�۸�"+"-----"+"����");
		for(int i=0;i<sc.goods.size();i++) {
			Goods temp=sc.goods.get(i);
			System.out.println(temp.getGn()+"��������"+temp.getGp()+"-----"+temp.getGc());
		}
		if(cs.getCm()-sc.gettotal()>0) {
			System.out.println("Ӧ����"+sc.gettotal());
			System.out.println("ʵ����"+cs.getCm());
			double f=cs.getCm()-sc.gettotal();
			System.out.println("���㣺"+df.format(f));
			System.out.println("��ӭ�´ι���");
		}
		else {
			System.out.println("��������");
		}
	}
}
