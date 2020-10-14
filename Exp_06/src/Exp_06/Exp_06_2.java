package Exp_06;

import java.util.*;

public class Exp_06_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("输入你的名字：");
		String name = sc.nextLine();
		System.out.println("你的名字是："+name);
		char[] Un = name.toCharArray();
		System.out.println(Un[0]+"在Unicode表中的位置为"+(int)Un[0]);
		System.out.println(Un[1]+"在Unicode表中的位置为"+(int)Un[1]);
		System.out.println(Un[2]+"在Unicode表中的位置为"+(int)Un[2]);
		sc.close();
	}

}
