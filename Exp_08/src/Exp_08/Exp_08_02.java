package Exp_08;

import java.util.*;

public class Exp_08_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		Scanner xl=new Scanner(System.in);
		for(int i=1;i<7;i++) {
			System.out.println(i+"��:");
			int xh= xl.nextInt();
			sum+=xh;
		}
		System.out.println("�ϰ������۶�Ϊ��"+sum);
		xl.close();
	}

}
