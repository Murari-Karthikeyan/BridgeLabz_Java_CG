class Circle {
    double radius;

    // Default constructor
    Circle() {
        this(1.0); // constructor chaining
    }

    // Parameterized constructor
    Circle(double r) {
        radius = r;
    }

    double area() {
        return Math.PI * radius * radius;
    }

    public static void main(String[] args) {
        Circle c1 = new Circle();
        Circle c2 = new Circle(5);

        System.out.println("Area1: " + c1.area());
        System.out.println("Area2: " + c2.area());
    }
}
