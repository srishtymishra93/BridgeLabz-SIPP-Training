    class Circle {
    double radius;

    // Default constructor
    Circle() {
        this(1.0);  // calling parameterized constructor
    }

    // Parameterized constructor
    Circle(double radius) {
        this.radius = radius;
    }
}
