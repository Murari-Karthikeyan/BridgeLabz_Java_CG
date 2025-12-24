class Student {

    // Access Modifiers
    public int rollNumber;
    protected String name;
    private double CGPA;

    // Constructor
    Student(int roll, String name, double cgpa) {
        this.rollNumber = roll;
        this.name = name;
        this.CGPA = cgpa;
    }

    // Public getter and setter for private CGPA
    public double getCGPA() {
        return CGPA;
    }

    public void setCGPA(double cgpa) {
        this.CGPA = cgpa;
    }
}

// Subclass demonstrating protected access
class PostgraduateStudent extends Student {

    PostgraduateStudent(int roll, String name, double cgpa) {
        super(roll, name, cgpa);
    }

    void displayDetails() {
        System.out.println("Roll Number: " + rollNumber); // public
        System.out.println("Name: " + name);              // protected
        System.out.println("CGPA: " + getCGPA());          // private via method
    }

    public static void main(String[] args) {
        PostgraduateStudent pg = new PostgraduateStudent(101, "Anita", 8.7);
        pg.displayDetails();
    }
}
