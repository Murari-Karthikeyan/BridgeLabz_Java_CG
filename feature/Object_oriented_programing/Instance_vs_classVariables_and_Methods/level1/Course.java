class Course {

    // Instance Variables
    String courseName;
    int duration; // in weeks
    double fee;

    // Class Variable
    static String instituteName = "ABC Institute";

    // Constructor
    Course(String name, int d, double f) {
        courseName = name;
        duration = d;
        fee = f;
    }

    // Instance Method
    void displayCourseDetails() {
        System.out.println("Course Name: " + courseName);
        System.out.println("Duration: " + duration + " weeks");
        System.out.println("Fee: " + fee);
        System.out.println("Institute: " + instituteName);
    }

    // Class Method
    static void updateInstituteName(String newName) {
        instituteName = newName;
    }

    public static void main(String[] args) {
        Course c1 = new Course("Java", 8, 12000);
        Course c2 = new Course("Python", 6, 10000);

        c1.displayCourseDetails();
        System.out.println();

        Course.updateInstituteName("XYZ Tech Academy");

        c2.displayCourseDetails();
    }
}
