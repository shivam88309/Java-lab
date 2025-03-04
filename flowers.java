abstract class Flower5{
    String flower_name;
    public abstract void flower_details(String flower_name,
                                        String flower_colour,
                                        String flower_price,
                                        String flower_size,
                                        String flower_smell); //abstract method

}
class Lilly extends Flower5{
    public void flower_details(String flower_name,
                               String flower_colour,
                               String flower_price,
                               String flower_size,
                               String flower_smell){//normal method
        System.out.println("Flower_Details");
        System.out.println("-----------------------------");
        System.out.println("Flower Name :"+flower_name);
        System.out.println("Flower Colour :"+flower_colour);
        System.out.println("Flower Price :"+flower_price);
        System.out.println("Flower Size :"+flower_size);
        System.out.println("Flower Smell :"+flower_smell);


    }
}
class flowers{
    public static void main(String[] args) {
        Lilly obj = new Lilly();
        obj.flower_details("Lilly","While","15$","Small","Amazing");


    }
}