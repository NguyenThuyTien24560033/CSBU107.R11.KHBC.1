import java.util.ArrayList;
import java.util.Scanner;

abstract class Ticket {
    private String ticketId;
    private String movieTitle;
    private int quantity;

    public Ticket(String ticketId, String movieTitle, int quantity) {
        if (ticketId == null || ticketId.trim().isEmpty()) {
            throw new IllegalArgumentException("Ticket ID must not be empty.");
        }
        if (movieTitle == null || movieTitle.trim().isEmpty()) {
            throw new IllegalArgumentException("Movie title must not be empty.");
        }
        if (quantity < 1) {
            throw new IllegalArgumentException("Quantity must be >= 1.");
        }
        this.ticketId = ticketId.trim();
        this.movieTitle = movieTitle.trim();
        this.quantity = quantity;
    }

    public String getID() {
        return ticketId;
    }

    public String getMovieTitle() {
        return movieTitle;
    }

    public int getQuantity() {
        return quantity;
    }

    public abstract double calculateTotalPrice();

    public void displayInfo() {
        System.out.println("Ticket ID: " + ticketId);
        System.out.println("Movie Title: " + movieTitle);
        System.out.println("Quantity: " + quantity);
    }

    public void displayInfo(int index) {
        System.out.println("\nTicket " + index);
        displayInfo();
    }
}

class RegularTicket extends Ticket {
    private final double unitPrice = 80000;
    private double discount;

    public RegularTicket(String ticketId, String movieTitle, int quantity) {
        super(ticketId, movieTitle, quantity);
        if (this.getQuantity() >= 5) {
            this.discount = 0.1;
        } else {
            this.discount = 0;
        }
    }

    @Override
    public double calculateTotalPrice() {
        return (this.getQuantity() * unitPrice) - (discount * this.getQuantity() * unitPrice);
    }

    @Override
    public void displayInfo() {
        System.out.println("Type: RegularTicket");
        super.displayInfo();
        System.out.println("Unit Price: " + String.format("%,.0f", unitPrice) + " VND");
        System.out.println("Discount Amount: " + String.format("%,.0f", discount * getQuantity() * unitPrice) + " VND");
        System.out.println("Final Total: " + String.format("%,.0f", this.calculateTotalPrice()) + " VND");
    }
}

class VIPTicket extends Ticket {
    private final double unitPrice = 150000;
    private double discount;

    public VIPTicket(String ticketId, String movieTitle, int quantity) {
        super(ticketId, movieTitle, quantity);
        if (this.getQuantity() >= 3) {
            this.discount = 0.15;
        } else {
            this.discount = 0;
        }
    }

    @Override
    public double calculateTotalPrice() {
        return (this.getQuantity() * unitPrice) - (discount * this.getQuantity() * unitPrice);
    }

    @Override
    public void displayInfo() {
        System.out.println("Type: VIPTicket");
        super.displayInfo();
        System.out.println("Unit Price: " + String.format("%,.0f", unitPrice) + " VND");
        System.out.println("Discount Amount: " + String.format("%,.0f", discount * getQuantity() * unitPrice) + " VND");
        System.out.println("Final Total: " + String.format("%,.0f", this.calculateTotalPrice()) + " VND");
    }
}

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Ticket> tickets = new ArrayList<>();
        int choice;

        do {
            System.out.println("\n=== MENU ===");
            System.out.println("1. Add ticket purchases");
            System.out.println("2. Display all purchases");
            System.out.println("3. Search purchases by movie title");
            System.out.println("4. Total revenue");
            System.out.println("5. Movie title with the highest total revenue");
            System.out.println("6. Display purchases from highest to lowest final total");
            System.out.println("7. Exit");
            System.out.println("============");
            System.out.print("Your choice: ");
            choice = Integer.parseInt(input.nextLine().trim());

            switch (choice) {
                case 1: {
                    System.out.println("\n--- Add Ticket Purchases ---");
                    System.out.print("Enter number of purchases (n > 0): ");
                    int n = Integer.parseInt(input.nextLine().trim());
                    while (n < 1) {
                        System.out.print("Invalid number of purchases (n > 0). Enter again: ");
                        n = Integer.parseInt(input.nextLine().trim());
                    }

                    for (int i = 0; i < n; i++) {
                        System.out.println("\nPurchase " + (i + 1) + "/" + n);
                        System.out.print("Choose ticket type (1. RegularTicket / 2. VIPTicket): ");
                        int type = Integer.parseInt(input.nextLine().trim());
                        while (type != 1 && type != 2) {
                            System.out.print("Invalid ticket type. Enter again (1 or 2): ");
                            type = Integer.parseInt(input.nextLine().trim());
                        }

                        System.out.print("Ticket ID: ");
                        String ticketId = input.nextLine().trim();
                        while (true) {
                            boolean duplicate = false;
                            for (Ticket ticket : tickets) {
                                if (ticket.getID().equalsIgnoreCase(ticketId)) {
                                    duplicate = true;
                                }
                            }
                            if (ticketId.isEmpty()) {
                                System.out.print("Ticket ID must not be empty. Enter again: ");
                                ticketId = input.nextLine().trim();
                            } else if (duplicate) {
                                System.out.print("Duplicate ticket ID. Enter again: ");
                                ticketId = input.nextLine().trim();
                            } else {
                                break;
                            }
                        }

                        System.out.print("Movie Title: ");
                        String movieTitle = input.nextLine().trim();
                        while (movieTitle.isEmpty()) {
                            System.out.print("Movie title must not be empty. Enter again: ");
                            movieTitle = input.nextLine().trim();
                        }

                        System.out.print("Quantity (>= 1): ");
                        int quantity = Integer.parseInt(input.nextLine().trim());
                        while (quantity < 1) {
                            System.out.print("Invalid quantity (>= 1). Enter again: ");
                            quantity = Integer.parseInt(input.nextLine().trim());
                        }

                        if (type == 1) {
                            tickets.add(new RegularTicket(ticketId, movieTitle, quantity));
                        } else {
                            tickets.add(new VIPTicket(ticketId, movieTitle, quantity));
                        }
                    }
                    System.out.println("Added " + n + " purchase(s) successfully.");
                    break;
                }

                case 2: {
                    System.out.println("\n--- Display All Purchases ---");
                    if (tickets.isEmpty()) {
                        System.out.println("The ticket list is empty.");
                    } else {
                        int index = 1;
                        for (Ticket ticket : tickets) {
                            ticket.displayInfo(index);
                            index++;
                        }
                    }
                    break;
                }

                case 3: {
                    System.out.println("\n--- Search By Movie Title ---");
                    if (tickets.isEmpty()) {
                        System.out.println("The ticket list is empty.");
                    } else {
                        System.out.print("Enter movie title to search: ");
                        String searchTitle = input.nextLine().trim();
                        int index = 1;
                        for (Ticket ticket : tickets) {
                            if (searchTitle.equalsIgnoreCase(ticket.getMovieTitle())) {
                                ticket.displayInfo(index);
                                index++;
                            }
                        }
                        if (index == 1) {
                            System.out.println("No purchase found for this movie title.");
                        }
                    }
                    break;
                }

                case 4: {
                    System.out.println("\n--- Total Revenue ---");
                    double total = 0;
                    for (Ticket ticket : tickets) {
                        total += ticket.calculateTotalPrice();
                    }
                    System.out.println("Total revenue: " + String.format("%,.0f", total) + " VND");
                    break;
                }

                case 5: {
                    System.out.println("\n--- Movie With The Highest Total Revenue ---");
                    if (tickets.isEmpty()) {
                        System.out.println("The ticket list is empty.");
                    } else {
                        String highestMovie = "";
                        double highestRevenue = 0;
                        for (int i = 0; i < tickets.size(); i++) {
                            double movieRevenue = 0;
                            for (int j = 0; j < tickets.size(); j++) {
                                if (tickets.get(i).getMovieTitle().equalsIgnoreCase(tickets.get(j).getMovieTitle())) {
                                    movieRevenue += tickets.get(j).calculateTotalPrice();
                                }
                            }
                            if (movieRevenue > highestRevenue) {
                                highestRevenue = movieRevenue;
                                highestMovie = tickets.get(i).getMovieTitle();
                            }
                        }
                        System.out.println("Movie with the highest revenue: " + highestMovie);
                        System.out.println("Total revenue of this movie: " + String.format("%,.0f", highestRevenue) + " VND");
                    }
                    break;
                }

                case 6: {
                    System.out.println("\n--- Purchases From Highest To Lowest Final Total ---");
                    if (tickets.isEmpty()) {
                        System.out.println("The ticket list is empty.");
                    } else {
                        ArrayList<Ticket> sorted = new ArrayList<>(tickets);
                        for (int i = 0; i < sorted.size() - 1; i++) {
                            for (int j = i + 1; j < sorted.size(); j++) {
                                if (sorted.get(i).calculateTotalPrice() < sorted.get(j).calculateTotalPrice()) {
                                    Ticket tmp = sorted.get(i);
                                    sorted.set(i, sorted.get(j));
                                    sorted.set(j, tmp);
                                }
                            }
                        }
                        int index = 1;
                        for (Ticket ticket : sorted) {
                            ticket.displayInfo(index);
                            index++;
                        }
                    }
                    break;
                }

                case 7:
                    System.out.println("Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }
        } while (choice != 7);
        input.close();
    }
}