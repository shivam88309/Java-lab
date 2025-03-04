//List in java:
import java.util.List;
import java.util.ArrayList;
class List1{
    public static void main(String[]args) {
        List<String> list = new ArrayList<>();//creating list
        list.add("Apple");
        list.add("Banana");
        list.add("Mango");
        list.add("kiwi");
        list.add("Papaya");
        System.out.println("fruits:" + list);
        System.out.println(list.get(1));

        //Implementation of list1

        list.remove("Papaya");

        //Implementation of list2

        String find_fruit = list.get(2);
        System.out.println("using index:" + find_fruit);

        //Implementation of list3

        for (String fruits : list) {
            System.out.println(fruits);

            }

        }
    }


