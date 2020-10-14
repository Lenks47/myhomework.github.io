package Exp15;

public class Judge {
   public void judge(Bird bird){
    bird.eat();
    bird.Fly();
}
   public void judge(Snake snake){
    snake.eat();
    snake.Walk();
}
   public void judge(Animal animal){
	animal.eat();
}
   public static void main(String args[]){
	Judge ju=new Judge();
	ju.judge(new Bird());   
	ju.judge(new Snake());
}

}