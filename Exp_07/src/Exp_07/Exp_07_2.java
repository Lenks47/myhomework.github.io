package Exp_07;
import java.util.*;
public class Exp_07_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=0;
		int money=0;
		int xuhao=0;
		Scanner dc=new Scanner(System.in);
		System.out.println("输入1结束，（注：每个菜只能点一次）");
		System.out.println("请输入菜品序号:");
		while(true) 
		{
		xuhao = dc.nextInt();
		if(xuhao==1) {
			System.out.println("已下单！");
			dc.close();
			return;
		}else 
		{
		switch(xuhao) {
		case 11:
			count=count+1;  
			money=money+15;
			System.out.println("你点了千层豆腐，+15");
			break;
		case 12:
			count=count+1;  
			money=money+20;
			System.out.println("你点了小炒肉，+20");
			break;
		case 13:
			count=count+1;  
			money=money+18;
			System.out.println("你点了清蒸罗非鱼，+18");
			break;
		case 14:
			count=count+1;  
			money=money+16;
			System.out.println("你点了蘑菇炒肉，+16");
			break;
		case 15:
			count=count+1;  
			money=money+15;
			System.out.println("你点了地三鲜，+15");
			break;
		}
		switch(count){
		case 1:
			System.out.println("你已经点了"+count+"道菜,当前价格为"+money);
			break;
		case 2:
			System.out.println("你已经点了"+count+"道菜,当前价格为"+(money-3));
			break;
		case 3:
			System.out.println("你已经点了"+count+"道菜,当前价格为"+(money-5));
			break;
		case 4:
			System.out.println("你已经点了"+count+"道菜,当前价格为"+(money-8));
			break;
		case 5:
			System.out.println("你已经点了"+count+"道菜,当前价格为"+70);
			break;
		}
		}
		if(count==5) {
			System.out.println("到达上限！");
			dc.close();
			return;
		}
		}
	}

}
