package Demo;

public class kji {  
    public static void main(String args) { 
        int sum=getmax(10,20,30);
        System.out.println(s);
     }
    public static int getmax(int a, int b,int c) {
    	int z=(a>b)?a:b;
        int max=(z>c)?z:c; 
        return max;
    }
    public static float getmax(float a, float b,float c) {
    	float z=(a>b)?a:b;
    	float max=(z>c)?z:c; 
        return max;
    }
}