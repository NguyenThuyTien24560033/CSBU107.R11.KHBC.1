import java.util.Scanner;
import java.util.ArrayList;
import java.io.PrintWriter;
import java.io.FileWriter;
import java.io.IOException;

class Customer {
    private String customerID;
    private String fullName;
    private String address;
    private String phoneNumber;

    Customer(String customerID, String fullName,
             String address, String phoneNumber) {
        this.customerID = customerID;
        this.fullName = fullName;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    public void display() {
        System.out.println("Customer ID: " + customerID);
        System.out.println("Full name: " + fullName);
        System.out.println("Address: " + address);
        System.out.println("Phone number: " + phoneNumber);
    }

    public void saveToFile(PrintWriter out) {
        out.println("Customer ID: " + customerID);
        out.println("Full name: " + fullName);
        out.println("Address: " + address);
        out.println("Phone number: " + phoneNumber);
    }
};

abstract class Product {
    private String ID;
    private String type;
    private double volume;
    private double price;

    Product(String ID, String type, double volume, double price) {
        if (volume <= 0) {
            throw new IllegalArgumentException("Invalid volume");
        }

        this.ID = ID;
        this.type = type;
        this.volume = volume;
        this.price = price;
    }

    public String getID() {
        return ID;
    }

    public String getType() {
        return type;
    }

    public double getVolume() {
        return volume;
    }

    public double getPrice() {
        return price;
    }

    public abstract double calculatePriceProduct();

    public void display() {
        System.out.println("Product ID: " + ID);
        System.out.println("Product type: " + type);
        System.out.println("Volume: " + volume + " ml");
        System.out.println("Unit price: " + price + " VND/ml");
        System.out.println("Product price: "+ calculatePriceProduct() + " VND");
    }

    public void saveToFile(PrintWriter out) {
        out.println("Product ID: " + ID);
        out.println("Product type: " + type);
        out.println("Volume: " + volume + " ml");
        out.println("Unit price: " + price + " VND/ml");
        out.println("Product price: "+ calculatePriceProduct() + " VND");
    }
};

class Perfume extends Product {
    Perfume(String ID, String type, double volume, double price) {
        super(ID, type, volume, price);
    }

    @Override
    public double calculatePriceProduct() {
        return getVolume() * getPrice();
    }
};

class Shampoo extends Product {
    Shampoo(String ID, String type, double volume, double price) {
        super(ID, type, volume, price);
    }

    @Override
    public double calculatePriceProduct() {
        return getVolume() * getPrice();
    }
};

class showerGel extends Product {
    showerGel(String ID, String type, double volume, double price) {
        super(ID, type, volume, price);
    }

    @Override
    public double calculatePriceProduct() {
        return getVolume() * getPrice();
    }
};

class productPackage {
    private ArrayList<Product> products = new ArrayList<>();

    public void addProduct(Product p) {
        products.add(p);
    }

    public double calculatePrice() {
        double total = 0;

        for (Product p : products) {
            total += p.calculatePriceProduct();
        }

        return total;
    }

    public void displayProducts() {
        for (Product p : products) {
            p.display();
            System.out.println("--------------------");
        }
    }

    public void saveToFile(PrintWriter out) {
        for (Product p : products) {
            p.saveToFile(out);
            out.println("--------------------");
        }
    }
};

class romanticPackage extends productPackage {
    public romanticPackage(Scanner input) {
        System.out.print("Enter Rose Perfume ID: ");
        String ID = input.nextLine();

        double volume;

        do {
            System.out.print("Enter Rose Perfume volume (ml): ");
            volume = Double.parseDouble(input.nextLine());

            if (volume <= 0) {
                System.out.println("Volume must be greater than 0. Please enter again.");
            }
        } while (volume <= 0);

        Perfume rose = new Perfume(ID, "Rose Perfume", volume, 20000);
        addProduct(rose);

        System.out.print("Do you want to add Shampoo? (y/n): ");
        String choice = input.nextLine();

        if (choice.equalsIgnoreCase("y")) {
            System.out.println("1. Dry Hair Shampoo");
            System.out.println("2. Oily Hair Shampoo - Standard 1");
            System.out.println("3. Oily Hair Shampoo - Standard 2");
            System.out.print("Choose Shampoo: ");

            int shampooChoice = Integer.parseInt(input.nextLine());

            String type = "";
            double price = 0;

            if (shampooChoice == 1) {
                type = "Dry Hair Shampoo";
                price = 20000;
            } else if (shampooChoice == 2) {
                type = "Oily Hair Shampoo - Standard 1";
                price = 30000;
            } else if (shampooChoice == 3) {
                type = "Oily Hair Shampoo - Standard 2";
                price = 40000;
            }

            if (price > 0) {
                System.out.print("Enter Shampoo ID: ");
                ID = input.nextLine();

                System.out.print("Enter Shampoo volume (ml): ");
                volume = Double.parseDouble(input.nextLine());

                Shampoo shampoo = new Shampoo(ID, type, volume, price);
                addProduct(shampoo);
            }
        }

        System.out.print("Do you want to add Shower Gel? (y/n): ");
        choice = input.nextLine();

        if (choice.equalsIgnoreCase("y")) {
            System.out.println("1. Dry Skin Shower Gel");
            System.out.println("2. Oily Skin Shower Gel");
            System.out.print("Choose Shower Gel: ");

            int gelChoice = Integer.parseInt(input.nextLine());

            String type = "";
            double price = 0;

            if (gelChoice == 1) {
                type = "Dry Skin Shower Gel";
                price = 20000;
            } else if (gelChoice == 2) {
                type = "Oily Skin Shower Gel";
                price = 40000;
            }

            if (price > 0) {
                System.out.print("Enter Shower Gel ID: ");
                ID = input.nextLine();

                System.out.print("Enter Shower Gel volume (ml): ");
                volume = Double.parseDouble(input.nextLine());

                showerGel gel = new showerGel(ID, type, volume, price);
                addProduct(gel);
            }
        }
    }
};

class freshAirPackage extends productPackage {

    public freshAirPackage(Scanner input) {
        int shampooChoice;
        String type;
        double price;

        do {
            System.out.println("Choose Oily Hair Shampoo:");
            System.out.println("1. Oily Hair Shampoo - Standard 1");
            System.out.println("2. Oily Hair Shampoo - Standard 2");
            System.out.print("Choose Shampoo: ");

            shampooChoice = Integer.parseInt(input.nextLine());

            type = "";
            price = 0;

            if (shampooChoice == 1) {
                type = "Oily Hair Shampoo - Standard 1";
                price = 30000;
            } else if (shampooChoice == 2) {
                type = "Oily Hair Shampoo - Standard 2";
                price = 40000;
            } else {
                System.out.println("Invalid choice! Please choose again.");
            }

        } while (price == 0);

        System.out.print("Enter Shampoo ID: ");
        String ID = input.nextLine();

        double volume;

        do {
            System.out.print("Enter Shampoo volume (ml): ");
            volume = Double.parseDouble(input.nextLine());

            if (volume <= 0) {
                System.out.println("Volume must be greater than 0. Please enter again.");
            }
        } while (volume <= 0);

        Shampoo shampoo = new Shampoo(ID, type, volume, price);
        addProduct(shampoo);

        System.out.print("Do you want to add Perfume? (y/n): ");
        String choice = input.nextLine();

        if (choice.equalsIgnoreCase("y")) {
            System.out.println("1. Rose Perfume");
            System.out.println("2. Chamomile Perfume");
            System.out.print("Choose Perfume: ");

            int perfumeChoice = Integer.parseInt(input.nextLine());

            type = "";
            price = 0;

            if (perfumeChoice == 1) {
                type = "Rose Perfume";
                price = 20000;
            } else if (perfumeChoice == 2) {
                type = "Chamomile Perfume";
                price = 15000;
            }

            if (price > 0) {
                System.out.print("Enter Perfume ID: ");
                ID = input.nextLine();

                System.out.print("Enter Perfume volume (ml): ");
                volume = Double.parseDouble(input.nextLine());

                Perfume perfume = new Perfume(ID, type, volume, price);
                addProduct(perfume);
            }
        }

        System.out.print("Do you want to add Shower Gel? (y/n): ");
        choice = input.nextLine();

        if (choice.equalsIgnoreCase("y")) {
            System.out.println("1. Dry Skin Shower Gel");
            System.out.println("2. Oily Skin Shower Gel");
            System.out.print("Choose Shower Gel: ");

            int gelChoice = Integer.parseInt(input.nextLine());

            type = "";
            price = 0;

            if (gelChoice == 1) {
                type = "Dry Skin Shower Gel";
                price = 20000;
            } else if (gelChoice == 2) {
                type = "Oily Skin Shower Gel";
                price = 40000;
            }

            if (price > 0) {
                System.out.print("Enter Shower Gel ID: ");
                ID = input.nextLine();

                System.out.print("Enter Shower Gel volume (ml): ");
                volume = Double.parseDouble(input.nextLine());

                showerGel gel = new showerGel(ID, type, volume, price);
                addProduct(gel);
            }
        }
    }
};

class Order {
    private String orderID;
    private Customer customerInfor;
    private String invoiceDate;
    private double orderPrice;
    private productPackage packageInfor;

    Order(String orderID, Customer customerInfor, String invoiceDate,
          productPackage packageInfor) {
        this.orderID = orderID;
        this.customerInfor = customerInfor;
        this.invoiceDate = invoiceDate;
        this.packageInfor = packageInfor;
        this.orderPrice = 0;
    }

    public void calculateOrderPrice() {
        this.orderPrice = packageInfor.calculatePrice();
    }

    public void display() {
        System.out.println("\nOrder ID: " + orderID);
        System.out.println("Invoice Date: " + invoiceDate);

        customerInfor.display();

        System.out.println("Package: "+ packageInfor.getClass().getSimpleName());

        System.out.println("\nProducts in package:");
        packageInfor.displayProducts();

        System.out.println("Order Price: " + orderPrice + " VND");
    }

    public void saveToFile(PrintWriter out) {
        out.println("\nOrder ID: " + orderID);
        out.println("Invoice Date: " + invoiceDate);

        customerInfor.saveToFile(out);

        out.println("Package: "
                + packageInfor.getClass().getSimpleName());

        out.println("Products in package:");
        packageInfor.saveToFile(out);

        out.println("Order Price: " + orderPrice + " VND");
        out.println("-----------------------------------");
    }
};

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Order> orders = new ArrayList<>();

        System.out.print("\nEnter the number of orders: ");
        int n = Integer.parseInt(input.nextLine());

        for (int i = 0; i < n; i++) {
            System.out.println("\nOrder " + (i + 1));

            System.out.print("Customer ID: ");
            String customerID = input.nextLine();

            System.out.print("Full name: ");
            String fullName = input.nextLine();

            System.out.print("Address: ");
            String address = input.nextLine();

            System.out.print("Phone number: ");
            String phoneNumber = input.nextLine();

            Customer customer = new Customer(customerID, fullName, address, phoneNumber);

            productPackage packageInfor;

            System.out.println("1. Romantic Package");
            System.out.println("2. Fresh-Air Package");
            System.out.print("Choose package: ");

            int choice = Integer.parseInt(input.nextLine());

            if (choice == 1) {
                packageInfor = new romanticPackage(input);
            } else if (choice == 2) {
                packageInfor = new freshAirPackage(input);
            } else {
                System.out.println("Invalid choice!");
                i--;
                continue;
            }

            System.out.print("\nThe order ID: ");
            String orderID = input.nextLine();

            System.out.print("The invoice date: ");
            String invoiceDate = input.nextLine();

            Order order = new Order(orderID, customer, invoiceDate, packageInfor);

            order.calculateOrderPrice();

            orders.add(order);
        }

        System.out.println("\n  ALL ORDERS  ");

        for (Order order : orders) {
            order.display();
        }

        try {
            PrintWriter out = new PrintWriter(new FileWriter("order_list.txt"));

            for (Order order : orders) {
                order.saveToFile(out);
            }

            out.close();

            System.out.println("\nOrders saved to order_list.txt");

        } catch (IOException e) {
            System.out.println("Cannot save file: " + e.getMessage());
        }

        input.close();
    }
};