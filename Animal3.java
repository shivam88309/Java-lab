import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;


public class Animal3 {
    public static void main(String [] args){
        List<String> list = new ArrayList<>();
        Scanner sr = new Scanner(System.in);
        System.out.print("1st element : ");
        String a =sr.nextLine();
        System.out.print("2nd element : ");
        String b =sr.nextLine();
        System.out.print("3rd element : ");
        String c =sr.nextLine();
        System.out.print("4th element : ");
        String d =sr.nextLine();
        System.out.print("5th element : ");
        String e = sr.nextLine();
        list.add(a);
        list.add(b);
        list.add(c);
        list.add(d);
        list.add(e);
        System.out.println(list);

        for (String i : list){
            System.out.println(i);
        }







    }

}
