package Exp_07;
import java.util.*;
public class Exp_07_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=0;
		int money=0;
		int xuhao=0;
		Scanner dc=new Scanner(System.in);
		System.out.println("����1��������ע��ÿ����ֻ�ܵ�һ�Σ�");
		System.out.println("�������Ʒ���:");
		while(true) 
		{
		xuhao = dc.nextInt();
		if(xuhao==1) {
			System.out.println("���µ���");
			dc.close();
			return;
		}else 
		{
		switch(xuhao) {
		case 11:
			count=count+1;  
			money=money+15;
			System.out.println("�����ǧ�㶹����+15");
			break;
		case 12:
			count=count+1;  
			money=money+20;
			System.out.println("�����С���⣬+20");
			break;
		case 13:
			count=count+1;  
			money=money+18;
			System.out.println("����������޷��㣬+18");
			break;
		case 14:
			count=count+1;  
			money=money+16;
			System.out.println("�����Ģ�����⣬+16");
			break;
		case 15:
			count=count+1;  
			money=money+15;
			System.out.println("����˵����ʣ�+15");
			break;
		}
		switch(count){
		case 1:
			System.out.println("���Ѿ�����"+count+"����,��ǰ�۸�Ϊ"+money);
			break;
		case 2:
			System.out.println("���Ѿ�����"+count+"����,��ǰ�۸�Ϊ"+(money-3));
			break;
		case 3:
			System.out.println("���Ѿ�����"+count+"����,��ǰ�۸�Ϊ"+(money-5));
			break;
		case 4:
			System.out.println("���Ѿ�����"+count+"����,��ǰ�۸�Ϊ"+(money-8));
			break;
		case 5:
			System.out.println("���Ѿ�����"+count+"����,��ǰ�۸�Ϊ"+70);
			break;
		}
		}
		if(count==5) {
			System.out.println("�������ޣ�");
			dc.close();
			return;
		}
		}
	}

}
