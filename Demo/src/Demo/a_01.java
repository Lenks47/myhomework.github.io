package Demo;

public class a_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	            String s1=new String("abc");
	            String s2=s1.intern();
	            String s3="abc";
	            System.out.println(s1==s2);
	            System.out.println(s2==s3);
	            System.out.println(s1==s3);
	        }
	}
