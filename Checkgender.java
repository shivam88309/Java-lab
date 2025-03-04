// custom Exception :using gender example
class Checkgender extends Exception{ //Exception class--01
    Checkgender(){                   //Exception class constructor-02
        super("Give valid gender....!!");

    }
}
class Checkgender1{
    //Exception method inside main class
    public static void checkValid(String gender) throws Checkgender{
       if (gender =="male"){
           System.out.println("Gender male is matched...!");
       }
       else if (gender == "female"){
           System.out.println("gender female is matched...!");
       }
       else{
           throw new Checkgender();
       }
    }


    public static void main(String[]args){
        //create try and catch book --04
        try{
            checkValid("different");
        }catch( Checkgender e){
            System.out.println("Caught Exception :"+e.getMessage());
        }
    }
}