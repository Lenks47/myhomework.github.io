package demo;

public class Student {
	int  number;//学号
	String  name;//姓名
	int  cidao,zaotui,qingjia,kuangke;//考勤数据
	double  total;//缺勤总数
	public Student(int number,String name,int cidao,int zaotui,int qingjia,int kuangke) {
		this.number=number;
		this.name=name;
		this.cidao=cidao;
		this.zaotui=zaotui;
		this.qingjia=qingjia;
		this.kuangke=kuangke;
		this.total = kuangke+cidao*0.5+zaotui*0.5;
	}
	public  void printStudent() {
		System.out.println(number+"	| "+name+"	| "+cidao+"	| "+zaotui+"	| "+qingjia+"	| "+kuangke+"	| "+(int)total+"	|");
	}//输出数据
}
