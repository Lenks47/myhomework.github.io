package Demo;
class Demo_1{
    public static void main(String[] args) throws Exception{
        int x = 0;
        try{
            x = div(5,2);
        }catch(Exception e){
            System.out.println(e);
        }
        System.out.println(x);
    }
    public static int div(int a,int b){
        return a / b ;
    }
}