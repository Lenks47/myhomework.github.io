package txt1;

public class People {
	  float hight, weight;
	  String head, ear, mouth;
	  void speak(String s) {
	    System.out.println(s);
	  }
	}

class A{
	  public static void main(String args[]) {
	    People zhubajie;
	    zhubajie = new People();
	    zhubajie.weight = 200f;
	    zhubajie.hight = 1.70F;
	    zhubajie.head = "��ͷ";
	    zhubajie.ear = "��ֻ�����";
	    zhubajie.mouth = "һֻ����";
	    System.out.println("����" + zhubajie.weight + "���" + zhubajie.hight);
	    System.out.println("ͷ��"+zhubajie.head+"�����䣺"+zhubajie.ear+"����ͣ�"+zhubajie.mouth);
			System.out.println("ʦ�������Ǳ�ȥ�����ˣ���ȥ�¹��ɣ�");
			System.out.println("����ô��");
			System.out.println("Ŷ��");
	  }
	}
