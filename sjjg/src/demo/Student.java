package demo;

public class Student {
	int  number;//ѧ��
	String  name;//����
	int  cidao,zaotui,qingjia,kuangke;//��������
	double  total;//ȱ������
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
	}//�������
}
