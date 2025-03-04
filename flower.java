//implementation-3 using java details for abstraction

abstract class Flowers1{
    String flower_Name;
    public abstract void flower_details();//abstract method
}
class Rose extends Flowers1{
    public void flower_details() {//normal method
        this.flower_Name = "Rose";
        System.out.println("Flower Details");
        System.out.println("------------------------------");
        System.out.println("Flower Name:"+this.flower_Name);

    }
}
public class flower{
    public static void main(String[] args) {
        Rose r = new Rose();
        r.flower_details();

    }
}