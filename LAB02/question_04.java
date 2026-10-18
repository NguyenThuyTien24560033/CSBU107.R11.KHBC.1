class Circle {
    private double centerX;
    private double centerY;
    private double radius;

    public Circle() {
        this.centerX = 0.0;
        this.centerY = 0.0;
        this.radius = 1.0;
    }

    public Circle(double centerX, double centerY, double radius) {
        this.centerX = centerX;
        this.centerY = centerY;
        this.radius = (radius > 0) ? radius : 1.0;
    }

    public double area() {
        return Math.PI * this.radius * this.radius;
    }

    public double perimeter() {
        return 2 * Math.PI * this.radius;
    }

    public boolean contains(double x, double y) {
        double dx = x - this.centerX;
        double dy = y - this.centerY;
        return (dx * dx + dy * dy) <= (this.radius * this.radius);
    }

    public static void main(String[] args) {
        System.out.println(" Default Unit Circle ");
        Circle c1 = new Circle();
        System.out.printf("Area c1: %.2f%n", c1.area());
        System.out.printf("Perimeter c1: %.2f%n", c1.perimeter());
        System.out.println("c1 contains (0, 0): " + c1.contains(0, 0)); 
        System.out.println("c1 contains (1, 0): " + c1.contains(1, 0)); 
        System.out.println("c1 contains (1, 1): " + c1.contains(1, 1));

        System.out.println("\n Circle 2 ");
        Circle c2 = new Circle(2.0, 3.0, 5.0);
        System.out.printf("Area c2: %.2f%n", c2.area());
        System.out.printf("Perimeter c2: %.2f%n", c2.perimeter());
        System.out.println("c2 contains (5, 7): " + c2.contains(5, 7)); 
        System.out.println("c2 contains (2, 3): " + c2.contains(2, 3)); 
        System.out.println("c2 contains (8, 8): " + c2.contains(8, 8)); 
    }
}