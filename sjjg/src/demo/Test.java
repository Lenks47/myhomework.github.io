package demo;

import java.util.Scanner;

public class Test {

public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.print("��ӭ���뿼��ϵͳ�������������˺ź����룬�ÿո������");
	String aString="zhang";
	String bString="123";
	if(sc.next().equals(aString)&&sc.next().equals(bString))
	{
		System.out.println("��¼�ɹ�����ӭ���뿼��ͳ��ϵͳ��");
		LinkList  list = new  LinkList();// ����һ��������
		System.out.print("��������Ҫ¼���ѧ��������");
		int m=sc.nextInt();
		Student[] stuent =new Student[m];// ����һ��Student������
		System.out.println("��������ĸ�ʽ����¼����Ϣ");
		System.out.println("ѧ��"+" | "+"����"+" | "+"�ٵ�"+" | "+"����"+" | "+"���"+" | "+"����");
		for (int i = 0; i < stuent.length; i++) {
			stuent[i] = new Student(sc.nextInt(), sc.next(), sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt());
			list.add(stuent[i]);
		}//��������
		System.out.println("ѧ��"+"	| "+"����"+"	| "+"�ٵ�"+"	| "+"����"+"	| "+"���"+"	| "+"����"+"	| "+"ȱ������"+"	| ");
		for (int i = list.length-1; i >=0 ; i--) {
			((Student) list.get(i)).printStudent();
		} // ѭ����������������	
	}
		else {
			System.out.println("��������˺Ż������������������");
		}//������ʾ
		sc.close();
	}

}
