class Rectangle {
    
    private double width;
    private double height;

    public Rectangle() {
        this.width = 1.0;
        this.height = 1.0;
    }

    public Rectangle(double width, double height) {
        this.width = (width > 0) ? width : 1.0;
        this.height = (height > 0) ? height : 1.0;
    }

    public double area() {
        return this.width * this.height;
    }

    public double perimeter() {
        return 2 * (this.width + this.height);
    }

    public void displayInfo() {
        System.out.println("Width: " + this.width + ", Height: " + this.height);
        System.out.println("Area: " + area() + ", Perimeter: " + perimeter());
    }

    public static void main(String[] args) {
        System.out.println("   Rectangle 1   ");
        Rectangle rect1 = new Rectangle();
        rect1.displayInfo();

        System.out.println("\n   Rectangle 2   ");
        Rectangle rect2 = new Rectangle(4.5, 3.0);
        rect2.displayInfo();

        System.out.println("\n Rectangle 3 ");
        Rectangle rect3 = new Rectangle(-5.0, 0.0);
        rect3.displayInfo();
    }
}
