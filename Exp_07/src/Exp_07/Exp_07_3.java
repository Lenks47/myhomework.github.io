package Exp_07;

import java.util.*;

public class Exp_07_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int y=2020;
		int m=3;
		int o=0;
		Scanner sr=new Scanner(System.in);
		System.out.println("欢迎光临万达海软乐园！目前开业前三天，优惠多多！礼品多多！");
		System.out.println("（按照提示输入您的出生年月，以获取详情）");
		System.out.println("请输入您的出身年份：");
		int sy = sr.nextInt();
		System.out.println("请输入您的出身月份：");
		int sm = sr.nextInt();
		o=y-sy;
		if(sm>m)
		o=o-1;
		System.out.println("年龄为"+o+"。");
		if(o>=7&&o<=15) {
			System.out.println("优惠折扣，乐玩价150元（包全天所有项目，赠送雪糕以及玩偶一个）");
		}
		else if(o>=16&&o<=60) {
			System.out.println("优惠折扣，乐玩价250元（包全天所有项目，赠送遮阳帽或雨伞一个）");
		}
		else if(o>=61&&o<=75) {
			System.out.println("优惠折扣，乐玩价120元（包全天所有项目，赠送一次免费茶饮）");
		}
		else if(o>75) {
			System.out.println("这位旅客很抱歉，本游乐设施出于安全考虑，不推荐75周岁人群游玩。但欢迎您免费步入公园散步(*^▽^*)");
		}
		sr.close();
		}
		

}
