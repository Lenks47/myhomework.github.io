package TeachingPlatform;

import java.util.Scanner;
public class TestUser {
	public static void main(String[] args) {
		String name1,name2;
		int cout1,cout,cout2;
		System.out.println("欢迎使用潇c工作是教学管理系统");
		System.out.println("请先输入权限");
		Scanner s = new Scanner(System.in);
		for (int i = 0; i < 2; i++) {
			name1 = s.next();
			if(name1.contains("学生")) {
				name2 = s.next();
				cout1 = s.nextInt();
				Tp t = new Tp(name2, cout1);
				System.out.println(t.toString());
			}else if(name1.contains("教师")) {
				Tp t1 = new Tp();
				name2 = s.next();
				cout2 = s.nextInt();
				t1.setName(name2);
				t1.setAvg(cout2);
				System.out.println(t1.toString());
			}
		}	
	}
}
