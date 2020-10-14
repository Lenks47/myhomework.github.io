package Supermarket;

public class Goods {
	private String Gn;
	private int Gc;
	private double Gp;
	public Goods(String n,double p,int c) {
		this.Gn=n;
		this.Gp=p;
		this.Gc=c;
	}
	public String getGn() {
		return Gn;
	}
	public void setGn(String gn) {
		Gn = gn;
	}
	public int getGc() {
		return Gc;
	}
	public void setGc(int gc) {
		Gc = gc;
	}
	public double getGp() {
		return Gp;
	}
	public void setGp(double gp) {
		Gp = gp;
	}
	
}
