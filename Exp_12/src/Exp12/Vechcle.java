package Exp12;

public class Vechcle {
	String speed;
	String kind;
	String color;
	
	public Vechcle() {
		
	}

	public String getSpeed() {
		return speed;
	}

	public void setSpeed(String speed) {
		this.speed = speed;
	}

	public String getKind() {
		return kind;
	}

	public void setKind(String kind) {
		this.kind = kind;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	public void SX() {
		System.out.println("����"+kind);
		System.out.println("�ٶ�"+speed);
		System.out.println("��ɫ"+color);
	}
}
