package Exp_06;

import java.util.Scanner;

public class Exp_06_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.print("�����һ����:");
		int n=input.nextInt();
		System.out.print("����ڶ�����:");
		int m=input.nextInt();
		System.out.println("n+m="+(n+m));
		System.out.println("n*m="+(n*m));
		System.out.println("n/m="+(float)(n/m));
		input.close();
	}

}
