package Exp_06;

import java.util.*;

public class Exp_06_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("����������֣�");
		String name = sc.nextLine();
		System.out.println("��������ǣ�"+name);
		char[] Un = name.toCharArray();
		System.out.println(Un[0]+"��Unicode���е�λ��Ϊ"+(int)Un[0]);
		System.out.println(Un[1]+"��Unicode���е�λ��Ϊ"+(int)Un[1]);
		System.out.println(Un[2]+"��Unicode���е�λ��Ϊ"+(int)Un[2]);
		sc.close();
	}

}
