class bike1{
    public void model(){
        System.out.println("Bike Model is Honda");
    }
}
class honda extends bike1{
    @Override
    public void model(){
        System.out.println("bike company is Tvs");
        System.out.println("bike price is 21 lacs");
    }
}
public class bike{
    public static void main(String[] args) {
//        honda obj = new honda();
//        obj.model();
        bike1 obj = new honda();
        obj.model();
    }
}