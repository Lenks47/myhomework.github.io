package Exp_08;

import java.util.*;

public class Exp_08_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		Scanner xl=new Scanner(System.in);
		for(int i=1;i<7;i++) {
			System.out.println(i+"月:");
			int xh= xl.nextInt();
			sum+=xh;
		}
		System.out.println("上半年销售额为："+sum);
		xl.close();
	}

}
