//Getter and setter
class company{
    private int empid;

    public int getId() {  //getter1 method
        return empid;
    }

    public void setId(int empid) {  //setter1 method
        this.empid = empid;
    }
}
class main8{
    public static void main (String[]args){
        System.out.println("Company Employee Details");
        System.out.println("--------------------------");
        company c = new company();
        System.out.println("Employee Details1");
        System.out.println("--------------------");
        c.setId(101);
        System.out.println("Employee Id :"+c.getId());
    }
}