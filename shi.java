public class shi {
    public static void main(String[] args) {
        int a = 20, b = 40;
        //Arithmetic operators
        System.out.println(a + b);//60
        System.out.println(a - b);//-20
        System.out.println(a * b);//800
        System.out.println(a / b);//0
        System.out.println(a % b);//20
        //comparison operators
        System.out.println(a < b);
        System.out.println(a > b);
        System.out.println(a <= b);
        System.out.println(a >= b);
        System.out.println(a == b);
        System.out.println(a != b);
        //assingment operators
        int c = 10, d = 15;
        c += 20;
        d += c;

        System.out.println(c + d);
        //Logical operator &&,||,!
        boolean e = true;
        System.out.println(a == 20 && b == 40);
        System.out.println(a == 20 && b == 45);
        System.out.println(a == 45 || b == 40);
        System.out.println(!e);
        //unary operator
        System.out.println(a + b);
        System.out.println(++a);
        System.out.println(a);
        System.out.println(++a);
        System.out.println(a++);
        System.out.println(--a);
        System.out.println(a--);
        System.out.println(a);

    }
}
