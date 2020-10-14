package Exp_07;

public class Exp_07_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="hello";
		String s2="Hello";
		int r=s1.compareTo(s2);
		if(r>0) {
			System.out.println(s1+">"+s2);
		}
		else if(r==0) {
			System.out.println(s1+"="+s2);
		}
		else if(r<0) {
			System.out.println(s1+"<"+s2);
		}
		double x1=1.123456789;
		double x2=1.1234567891;
		if(x1>x2) {
			System.out.println(x1+">"+x2);
		}
		else if(x1==x2) {
			System.out.println(x1+"="+x2);
		}
		else if(x1<x2) {
			System.out.println(x1+"<"+x2);
		}
		boolean b1=true;
		boolean b2=true;
		if(b1==b2) {
			System.out.println(b1+"="+b2);
		}
		else {
			System.out.println(b1+"!="+b2);
		}
		

	}

}
