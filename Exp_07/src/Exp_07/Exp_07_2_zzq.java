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
		System.out.println("�˵�:\n");
		System.out.println("11  ǧ�㶹��---------15��Ԫ\n");
		System.out.println("12  С����-----------15��Ԫ\n");
		System.out.println("13  �����޷���-------15��Ԫ\n");
		System.out.println("14  Ģ������---------15��Ԫ\n");
		System.out.println("15  ������-----------15��Ԫ\n");
		System.out.println("���ϲ�Ʒ����������������ܼۼ�3��Ԫ,��������5��Ԫ,��������8��Ԫ,ȫ��������ܼ�Ϊ70��Ԫ:\n");
		System.out.println("�㵥ʱ�����Ʒ����ż��ɵ㵥,����ž�ֹͣ�㵥\n");
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
					System.out.println("������ȷ�Ĳ�Ʒ��\n");
					break;
			}
		}while(ccc == 1);
		System.out.println("����Ĳ�Ʒ��:\n");
		for(int i = cnt;i>0;i--)
		{
			switch(cout[i]) {
			case 1:
					System.out.println("ǧ�㶹��		");break;
			case 2:
					System.out.println("С���� 		");break;
			case 3:
					System.out.println("�����޷���	");break;
			case 4:
					System.out.println("Ģ������		");break;
			case 5:
					System.out.println("������");break;
			}
		}
		switch(cnt) {
		case 1:
				System.out.println("�Żݺ��ܼ�Ϊ:"+sum);break;
		case 2:
				System.out.println("�Żݺ��ܼ�Ϊ:"+(sum-3));break;
		case 3:
				System.out.println("�Żݺ��ܼ�Ϊ:"+(sum-5));break;
		case 4:
				System.out.println("�Żݺ��ܼ�Ϊ:"+(sum-8));break;
		case 5:
				System.out.println("�Żݺ��ܼ�Ϊ:"+70);break;
		}
	}

}
