//class constructor
class simple{
    int x;
    // Create a class constructor for the simple class
    public simple() {
        x = 5;
    }
    public static void main(String[] args) {
        simple myObj = new simple(); // Create an object (This will call the constructor)
        System.out.println(myObj.x);
    }
}