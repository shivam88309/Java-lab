class Vehicles{
    public  static void car_company(){
        System.out.println("Car Company is : Benz");
    }
}
class Car extends Vehicles{
    public  static void car_price(){
        System.out.println("Car Price is : 50Lakhs");
    }
}
public class shivam1 {
    public  static void main(String[]args){
        System.out.println("Car Details");
        System.out.println("==========================");
        Car obj1 = new Car();
        obj1.car_company();
        obj1.car_price();
    }
}