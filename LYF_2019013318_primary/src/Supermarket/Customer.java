package Supermarket;

public class Customer {
	private String Cn;
	private double Cm;
	private ShoppingCar sc;
	public Customer(String n,double m) {
		this.Cm=m;
		this.Cn=n;
		sc=new ShoppingCar();
	}
	public String getCn() {
		return Cn;
	}
	public void setCn(String cn) {
		Cn = cn;
	}
	public double getCm() {
		return Cm;
	}
	public void setCm(double cm) {
		Cm = cm;
	}
	public ShoppingCar getSc() {
		return sc;
	}
	public void setSc(ShoppingCar sc) {
		this.sc = sc;
	}
	
	public void add(Goods g) {
		sc.addgoods(g);
	}
	public void del(Goods g) {
		sc.delgoods(g);
	}
}
