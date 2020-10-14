package demo;

import java.util.Scanner;

public class Test {

public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.print("欢迎登入考勤系统，请输入您的账号和密码，用空格隔开：");
	String aString="zhang";
	String bString="123";
	if(sc.next().equals(aString)&&sc.next().equals(bString))
	{
		System.out.println("登录成功！欢迎进入考情统计系统！");
		LinkList  list = new  LinkList();// 创建一个单链表
		System.out.print("请输入需要录入的学生人数：");
		int m=sc.nextInt();
		Student[] stuent =new Student[m];// 创建一个Student类数组
		System.out.println("请以下面的格式输入录入信息");
		System.out.println("学号"+" | "+"姓名"+" | "+"迟到"+" | "+"早退"+" | "+"请假"+" | "+"旷课");
		for (int i = 0; i < stuent.length; i++) {
			stuent[i] = new Student(sc.nextInt(), sc.next(), sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt());
			list.add(stuent[i]);
		}//输入数据
		System.out.println("学号"+"	| "+"姓名"+"	| "+"迟到"+"	| "+"早退"+"	| "+"请假"+"	| "+"旷课"+"	| "+"缺勤总数"+"	| ");
		for (int i = list.length-1; i >=0 ; i--) {
			((Student) list.get(i)).printStudent();
		} // 循环输出链表里的数据	
	}
		else {
			System.out.println("您输入的账号或密码错误！请重新输入");
		}//错误提示
		sc.close();
	}

}
