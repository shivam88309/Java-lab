class Student_Detail { // User-defined class
    private static int id = 151;  // Static id for all students
    private String name; // Non-static name for individual students

    public int getId() { // Getter method for id
        return id;
    }

    public String getName() { // Getter method for name
        return name;
    }

    public void setName(String name) { // Setter method for name
        this.name = name;
    }
}

public class Shivay { // Main class
    public static void main(String[] args) { // Main method
        Student_Detail s = new Student_Detail(); // Creating an object of Student_Detail
        System.out.println("Student ID: " + s.getId()); // Getting and printing the ID

        s.setName("Ashif"); // Setting the name using setter method
        System.out.println("Student Name: " + s.getName()); // Getting and printing the name
    }
}
