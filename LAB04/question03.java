import java.util.ArrayList;
import java.util.Scanner;

abstract class Delivery {
    private String orderID;
    private String customerName;
    private double distance;
    private double parcelWeight;
    private static int count = 0;

    public Delivery(String orderID, String customerName, double distance, double parcelWeight) {
        if (orderID == null || orderID.trim().isEmpty()) {
            throw new IllegalArgumentException("Order ID must not be empty.");
        }
        if (customerName == null || customerName.trim().isEmpty()) {
            throw new IllegalArgumentException("Customer name must not be empty.");
        }
        if (distance <= 0) {
            throw new IllegalArgumentException("Distance must be > 0.");
        }
        if (parcelWeight <= 0) {
            throw new IllegalArgumentException("Parcel weight must be > 0.");
        }
        this.orderID = orderID.trim();
        this.customerName = customerName.trim();
        this.distance = distance;
        this.parcelWeight = parcelWeight;
        count++;
    }

    public String getOrderID() {
        return orderID;
    }

    public String getCustomerName() {
        return customerName;
    }

    public double getDistance() {
        return distance;
    }

    public double getParcelWeight() {
        return parcelWeight;
    }

    public static int getCount() {
        return count;
    }

    public abstract double calculateShippingFee();

    public void displayInfo() {
        System.out.println("Order ID: " + orderID);
        System.out.println("Customer Name: " + customerName);
        System.out.println("Distance: " + distance + " km");
        System.out.println("Parcel Weight: " + parcelWeight + " kg");
    }

    public void displayInfo(int index) {
        System.out.println("\nOrder " + index);
        displayInfo();
    }
}

class StandardDelivery extends Delivery {

    public StandardDelivery(String orderID, String customerName, double distance, double parcelWeight) {
        super(orderID, customerName, distance, parcelWeight);
    }

    @Override
    public double calculateShippingFee() {
        return 15000 + 3000 * getDistance() + 2000 * getParcelWeight();
    }

    @Override
    public void displayInfo() {
        System.out.println("Type: StandardDelivery");
        super.displayInfo();
        System.out.println("Shipping Fee: " + String.format("%,.0f", this.calculateShippingFee()) + " VND");
    }
}

class ExpressDelivery extends Delivery {

    public ExpressDelivery(String orderID, String customerName, double distance, double parcelWeight) {
        super(orderID, customerName, distance, parcelWeight);
    }

    @Override
    public double calculateShippingFee() {
        return 30000 + 5000 * getDistance() + 4000 * getParcelWeight();
    }

    @Override
    public void displayInfo() {
        System.out.println("Type: ExpressDelivery");
        super.displayInfo();
        System.out.println("Shipping Fee: " + String.format("%,.0f", this.calculateShippingFee()) + " VND");
    }
}

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Delivery> deliveries = new ArrayList<>();
        int choice;

        do {
            System.out.println("\n=== MENU ===");
            System.out.println("1. Add orders");
            System.out.println("2. Display all orders and shipping fees");
            System.out.println("3. Search by order ID");
            System.out.println("4. Count orders for each delivery type");
            System.out.println("5. Total shipping revenue");
            System.out.println("6. Print orders whose fee exceeds a threshold");
            System.out.println("7. Display the number of created Delivery objects");
            System.out.println("8. Exit");
            System.out.println("============");
            System.out.print("Your choice: ");
            choice = Integer.parseInt(input.nextLine().trim());

            switch (choice) {
                case 1: {
                    System.out.println("\n--- Add Orders ---");
                    System.out.print("Enter number of orders (n > 0): ");
                    int n = Integer.parseInt(input.nextLine().trim());
                    while (n < 1) {
                        System.out.print("Invalid number of orders (n > 0). Enter again: ");
                        n = Integer.parseInt(input.nextLine().trim());
                    }

                    for (int i = 0; i < n; i++) {
                        System.out.println("\nOrder " + (i + 1) + "/" + n);
                        System.out.print("Choose delivery type (1. StandardDelivery / 2. ExpressDelivery): ");
                        int type = Integer.parseInt(input.nextLine().trim());
                        while (type != 1 && type != 2) {
                            System.out.print("Invalid delivery type. Enter again (1 or 2): ");
                            type = Integer.parseInt(input.nextLine().trim());
                        }

                        System.out.print("Order ID: ");
                        String orderID = input.nextLine().trim();
                        while (true) {
                            boolean duplicate = false;
                            for (Delivery delivery : deliveries) {
                                if (delivery.getOrderID().equalsIgnoreCase(orderID)) {
                                    duplicate = true;
                                }
                            }
                            if (orderID.isEmpty()) {
                                System.out.print("Order ID must not be empty. Enter again: ");
                                orderID = input.nextLine().trim();
                            } else if (duplicate) {
                                System.out.print("Duplicate order ID. Enter again: ");
                                orderID = input.nextLine().trim();
                            } else {
                                break;
                            }
                        }

                        System.out.print("Customer Name: ");
                        String customerName = input.nextLine().trim();
                        while (customerName.isEmpty()) {
                            System.out.print("Customer name must not be empty. Enter again: ");
                            customerName = input.nextLine().trim();
                        }

                        System.out.print("Distance in km (> 0): ");
                        double distance = Double.parseDouble(input.nextLine().trim());
                        while (distance <= 0) {
                            System.out.print("Invalid distance (> 0). Enter again: ");
                            distance = Double.parseDouble(input.nextLine().trim());
                        }

                        System.out.print("Parcel Weight in kg (> 0): ");
                        double parcelWeight = Double.parseDouble(input.nextLine().trim());
                        while (parcelWeight <= 0) {
                            System.out.print("Invalid parcel weight (> 0). Enter again: ");
                            parcelWeight = Double.parseDouble(input.nextLine().trim());
                        }

                        if (type == 1) {
                            deliveries.add(new StandardDelivery(orderID, customerName, distance, parcelWeight));
                        } else {
                            deliveries.add(new ExpressDelivery(orderID, customerName, distance, parcelWeight));
                        }
                    }
                    System.out.println("Added " + n + " order(s) successfully.");
                    break;
                }

                case 2: {
                    System.out.println("\n--- Display All Orders ---");
                    if (deliveries.isEmpty()) {
                        System.out.println("The order list is empty.");
                    } else {
                        int index = 1;
                        for (Delivery delivery : deliveries) {
                            delivery.displayInfo(index);
                            index++;
                        }
                    }
                    break;
                }

                case 3: {
                    System.out.println("\n--- Search By Order ID ---");
                    if (deliveries.isEmpty()) {
                        System.out.println("The order list is empty.");
                    } else {
                        System.out.print("Enter order ID to search: ");
                        String searchID = input.nextLine().trim();
                        boolean found = false;
                        for (Delivery delivery : deliveries) {
                            if (searchID.equalsIgnoreCase(delivery.getOrderID())) {
                                found = true;
                                System.out.println();
                                delivery.displayInfo();
                                break;
                            }
                        }
                        if (!found) {
                            System.out.println("The order does not exist.");
                        }
                    }
                    break;
                }

                case 4: {
                    System.out.println("\n--- Count Orders For Each Delivery Type ---");
                    int countStandard = 0;
                    int countExpress = 0;
                    for (Delivery delivery : deliveries) {
                        if (delivery instanceof StandardDelivery) {
                            countStandard++;
                        }
                        if (delivery instanceof ExpressDelivery) {
                            countExpress++;
                        }
                    }
                    System.out.println("StandardDelivery: " + countStandard);
                    System.out.println("ExpressDelivery: " + countExpress);
                    break;
                }

                case 5: {
                    System.out.println("\n--- Total Shipping Revenue ---");
                    double total = 0;
                    for (Delivery delivery : deliveries) {
                        total += delivery.calculateShippingFee();
                    }
                    System.out.println("Total shipping revenue: " + String.format("%,.0f", total) + " VND");
                    break;
                }

                case 6: {
                    System.out.println("\n--- Orders Exceeding A Fee Threshold ---");
                    if (deliveries.isEmpty()) {
                        System.out.println("The order list is empty.");
                    } else {
                        System.out.print("Enter threshold in VND (>= 0): ");
                        double threshold = Double.parseDouble(input.nextLine().trim());
                        while (threshold < 0) {
                            System.out.print("Invalid threshold (>= 0). Enter again: ");
                            threshold = Double.parseDouble(input.nextLine().trim());
                        }
                        int index = 1;
                        for (Delivery delivery : deliveries) {
                            if (delivery.calculateShippingFee() > threshold) {
                                delivery.displayInfo(index);
                                index++;
                            }
                        }
                        if (index == 1) {
                            System.out.println("No order has a fee exceeding "
                                    + String.format("%,.0f", threshold) + " VND.");
                        }
                    }
                    break;
                }

                case 7: {
                    System.out.println("\n--- Created Delivery Objects ---");
                    System.out.println("Number of successfully created Delivery objects: " + Delivery.getCount());
                    break;
                }

                case 8:
                    System.out.println("Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }
        } while (choice != 8);
        input.close();
    }
}