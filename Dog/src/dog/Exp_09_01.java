package dog;

public class Exp_09_01 {
	public static void main(String[] args) {
		Dog p=new Dog();
		p.mz="KARAN";
		System.out.println("名字"+p.mz);
		p.nl=4;
		System.out.println("年龄"+p.nl);
		p.pz="萨摩耶";
		System.out.println("品种"+p.pz);
		p.bp="西伯利亚";
		System.out.println("出生地"+p.bp);
		p.zr="Lenks";
		System.out.println("主人"+p.zr);
		p.sy=false;
		System.out.println("是否有过生育？"+p.sy);
		p.chi("狗粮");
		p.jiao();
		p.pao();
		p.tiao();
	}
}
