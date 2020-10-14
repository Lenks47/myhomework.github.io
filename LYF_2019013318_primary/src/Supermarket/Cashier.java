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
		System.out.println("打印凭条");
		System.out.println("顾客:"+cs.getCn());
		System.out.println("收银:"+this.n);
		System.out.println("商品名称"+"————————————"+"价格"+"-----"+"数量");
		for(int i=0;i<sc.goods.size();i++) {
			Goods temp=sc.goods.get(i);
			System.out.println(temp.getGn()+"————"+temp.getGp()+"-----"+temp.getGc());
		}
		if(cs.getCm()-sc.gettotal()>0) {
			System.out.println("应付："+sc.gettotal());
			System.out.println("实付："+cs.getCm());
			double f=cs.getCm()-sc.gettotal();
			System.out.println("找零："+df.format(f));
			System.out.println("欢迎下次光临");
		}
		else {
			System.out.println("您的余额不足");
		}
	}
}
