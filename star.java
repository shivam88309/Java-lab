import java.io.*;
interface star{
    //public abstract void start();//abstract method
    void start();//interface method
}
class star1 implements star{ //implement interface class
    public void start(){ //normal method
        System.out.println("car is starting");
    }
}
class Interfaces{
    public static void main(String args[]){
        star1 obj=new star1();
        obj.start();
    }
}
