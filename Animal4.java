import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Animal4{
    public static void main(String [] args) {
        List<String> list = new ArrayList<>();
        Scanner sr = new Scanner(System.in);
        while (true) {

            System.out.print("Enter element : ('done to finish') ");
            String a = sr.nextLine();
            if (a.equalsIgnoreCase("done")) {
                break;
            }
            list.add(a);
        }

        System.out.println(list);

        for (String i : list) {
            System.out.println(i);
        }


    }
}