interface Animals {//creating a interface
    void sound();
}
class Cat implements Animals{
    public void sound(){//non static method
        System.out.println("Meow Meow");
    }
}
class Animal1 {
    public static void sound() {
        System.out.println("Meow Meow ---Animal class");
    }

    public static void main(String[] args) {
        Cat d = new Cat();   //Required object for implementation class
        d.sound();
        sound();  //Directly we can call static method inside main class
    }
}