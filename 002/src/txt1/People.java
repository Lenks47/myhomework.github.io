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
	    zhubajie.head = "大头";
	    zhubajie.ear = "两只大耳朵";
	    zhubajie.mouth = "一只大嘴";
	    System.out.println("重量" + zhubajie.weight + "身高" + zhubajie.hight);
	    System.out.println("头："+zhubajie.head+"；耳朵："+zhubajie.ear+"；嘴巴："+zhubajie.mouth);
			System.out.println("师父，咱们别去西天了，改去月宫吧！");
			System.out.println("可以么？");
			System.out.println("哦！");
	  }
	}
