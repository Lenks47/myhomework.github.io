package TeachingPlatform;

public class Tp {
	private String name;
	private int avg;
	private String jurisdiction;
	Tp() {
		name = null;
		avg = 0;
		jurisdiction = "��ʦ";
	}
	Tp(String name, int avg) {
		this.name = name;
		this.avg = avg;
		jurisdiction = "ѧ��" ;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAvg() {
		return avg;
	}
	public void setAvg(int avg) {
		this.avg = avg;
	}
	@Override
	public String toString() {
		return "[�û���=" + name + ", ����=" + avg + ", Ȩ��"+jurisdiction+"]";
	}
	
}
