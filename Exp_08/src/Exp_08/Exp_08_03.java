package Exp_08;

public class Exp_08_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {8,5,3,7,6};
		int max=a[0];
		for(int i=0;i<a.length;i++) {
			if(a[i]>max) {
				max=a[i];
			}
		}
		for(int j=0;j<a.length-1;j++) {
			for(int k=0;k<a.length-1-j;k++) {
				if(a[k]>a[k+1]) {
					int t=a[k];
					a[k]=a[k+1];
					a[k+1]=t;
				}
			}
		}
		System.out.println("最大值为："+max);
		System.out.print("从小到大排序为：");
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]);
		}
	}

}
