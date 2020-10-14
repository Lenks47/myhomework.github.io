package Exp_07;

import java.util.*;

public class Exp_07_2_zzq {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int cout[] = {1,1,1,1,1};
		int sum = 0,cnt = 0;
		int num1 = 0;
		int ccc = 1;
		System.out.println("菜单:\n");
		System.out.println("11  千层豆腐---------15美元\n");
		System.out.println("12  小炒肉-----------15美元\n");
		System.out.println("13  清蒸罗非鱼-------15美元\n");
		System.out.println("14  蘑菇炖肉---------15美元\n");
		System.out.println("15  地三鲜-----------15美元\n");
		System.out.println("以上菜品任意点两样可享受总价减3美元,三样立减5美元,四样立减8美元,全点可以让总价为70美元:\n");
		System.out.println("点单时输入菜品的序号即可点单,输入九九停止点单\n");
		do {
			num1 = sc.nextInt();
			switch(num1) {
			case 11:
					cout[0] = 1;sum+=15;cnt++;break;
			case 12:
					cout[1] = 2;sum+=20;cnt++;break;
			case 13:
					cout[2] = 3;sum+=18;cnt++;break;
			case 14:
					cout[3] = 4;sum+=16;cnt++;break;
			case 15:
					cout[4] = 5;sum+=15;cnt++;break;
			case 99:
					ccc = 0;
					sc.close();
					break;
			default:
					System.out.println("输入正确的菜品号\n");
					break;
			}
		}while(ccc == 1);
		System.out.println("您点的菜品有:\n");
		for(int i = cnt;i>0;i--)
		{
			switch(cout[i]) {
			case 1:
					System.out.println("千层豆腐		");break;
			case 2:
					System.out.println("小炒肉 		");break;
			case 3:
					System.out.println("清蒸罗非鱼	");break;
			case 4:
					System.out.println("蘑菇炒肉		");break;
			case 5:
					System.out.println("地三鲜");break;
			}
		}
		switch(cnt) {
		case 1:
				System.out.println("优惠后总价为:"+sum);break;
		case 2:
				System.out.println("优惠后总价为:"+(sum-3));break;
		case 3:
				System.out.println("优惠后总价为:"+(sum-5));break;
		case 4:
				System.out.println("优惠后总价为:"+(sum-8));break;
		case 5:
				System.out.println("优惠后总价为:"+70);break;
		}
	}

}
