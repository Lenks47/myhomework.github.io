package yihcang;

public class Exp_1 {
		public static void main(String args[]){
			int result=divide(0,4);
			System.out.println(result);
	}
	public static int divide(int x,int y)throws ArithmeticException{
	if(x==0) {
		throw new ArithmeticException("除数不能为零");
	}
	else return x/y;
	}
}

