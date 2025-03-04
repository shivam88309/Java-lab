
class vehicles{
    public  static void car_company(){
        System.out.println("Car Company is : Benz");
    }
}
class car extends vehicles{
    public  static void car_price(){
        System.out.println("Car Price is : 50Lakhs");
    }
}
public class shivam3 {
    public  static void main(String[]args){
        System.out.println("Car Details");
        System.out.println("==========================");
        car obj1 = new car();
        obj1.car_company();
        obj1.car_price();
    }
}

