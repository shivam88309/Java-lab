//Custom Exception using 4 season.
class Checkseason1 extends Exception{ //step---1
    Checkseason1(){  //step-------2
        super("Please give valid month...!!");

    }

}

class Checkseason{
    //step ----3
    public static void checkMonth(String month) throws Checkseason1 {
        if (month == "jan" ||month == "dec" || month =="feb") {
            System.out.println("This is ur's Favourite winter...!!");
        } else if (month == "Mar" || month =="Apr" || month =="May") {
            System.out.println("this is your fav summer...!!");
        } else if (month == "Jun" || month == "Jully" || month == "Aug") {
            System.out.println("This is your fav rainy");

        } else if (month == "Sep" || month == "Oct" || month =="Nov") {
            System.out.println("This is your fav Automan");

        }
        else{
            throw new Checkseason1();
        }
    }

    public static void main(String[] args) {
        //step 4 : create try and catch block
        try {
            checkMonth("Apr");
        } catch (Checkseason1 e) {
            System.out.println("Caught Exception :" + e.getMessage());

        } finally {
            System.out.println("Seasons is completed...!!");
        }


    }   }