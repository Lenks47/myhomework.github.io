package Exp_07;

import java.util.*;

public class Exp_07_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int y=2020;
		int m=3;
		int o=0;
		Scanner sr=new Scanner(System.in);
		System.out.println("��ӭ������ﺣ����԰��Ŀǰ��ҵǰ���죬�Żݶ�࣡��Ʒ��࣡");
		System.out.println("��������ʾ�������ĳ������£��Ի�ȡ���飩");
		System.out.println("���������ĳ�����ݣ�");
		int sy = sr.nextInt();
		System.out.println("���������ĳ����·ݣ�");
		int sm = sr.nextInt();
		o=y-sy;
		if(sm>m)
		o=o-1;
		System.out.println("����Ϊ"+o+"��");
		if(o>=7&&o<=15) {
			System.out.println("�Ż��ۿۣ������150Ԫ����ȫ��������Ŀ������ѩ���Լ���żһ����");
		}
		else if(o>=16&&o<=60) {
			System.out.println("�Ż��ۿۣ������250Ԫ����ȫ��������Ŀ����������ñ����ɡһ����");
		}
		else if(o>=61&&o<=75) {
			System.out.println("�Ż��ۿۣ������120Ԫ����ȫ��������Ŀ������һ����Ѳ�����");
		}
		else if(o>75) {
			System.out.println("��λ�ÿͺܱ�Ǹ����������ʩ���ڰ�ȫ���ǣ����Ƽ�75������Ⱥ���档����ӭ����Ѳ��빫԰ɢ��(*^��^*)");
		}
		sr.close();
		}
		

}
