class Calculator {

    public int add(int a, int b) {
        return a + b;
    }

    public double add(double a, double b) {
        return a + b;
    }

    public int add(int a, int b, int c) {
        return a + b + c;
    }

    public int max(int a, int b) {
        return Math.max(a, b);
    }

    public double max(double a, double b) {
        return Math.max(a, b);
    }

    public static void main(String[] args) {
        Calculator cal = new Calculator();
        System.out.print("add(2, 3) = " + cal.add(2, 3));
        System.out.println(" --> Calls add(int, int) because arguments are 2 integers.");

        System.out.print("add(2.5, 3.5) = " + cal.add(2.5, 3.5));
        System.out.println(" --> Calls add(double, double) because arguments are floating-point numbers.");

        
        System.out.print("add(2, 3, 4) = " + cal.add(2, 3, 4));
        System.out.println(" --> Calls add(int, int, int) because 3 integer arguments are provided.");

        
        System.out.print("max(5, 8) = " + cal.max(5, 8));
        System.out.println(" --> Calls max(int, int) because both arguments are integers.");

        System.out.print("max(5.5, 3.2) = " + cal.max(5.5, 3.2));
        System.out.println(" --> Calls max(double, double) because both arguments are doubles.");
    }
}