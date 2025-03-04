import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

class Sets_scanner {
    public static void main(String[] args) {
        Set<String> politics = new HashSet<>();

        Scanner sr = new Scanner(System.in);
        while(true){
            System.out.println("Enter : (done to finish) ");
            String a = sr.nextLine();
            if(a.equalsIgnoreCase("done")){
                break;
            }
            politics.add(a);


        }
        System.out.println(politics);
    }
}