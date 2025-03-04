class bike1{
    public void model(){
        System.out.println("Bike Model is Pulsor");
    }
}
class pulsor extends bike1{
    @Override
    public void model(){
        System.out.println("bike company is Bazaz");
        System.out.println("bike price is 21 lacs");
    }
}
public class bike{
    public static void main(String[] args) {
//        pulsor obj = new pulsor();
//        obj.model();
        bike1 obj = new pulsor();
        obj.model();
    }
}