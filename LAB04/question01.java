import java.util.Scanner;
import java.util.ArrayList;

abstract class  LibraryItem{

    private String uniqueID;
    private String title;
    private String author;
    private int borrowedDay;

    public LibraryItem(String uniqueID, String title, String author, int borrowedDay) {
        if(uniqueID == null || uniqueID.trim().isEmpty()){
            throw new IllegalArgumentException("ID must be not empty.");
        }
        if(borrowedDay <1){
            throw new IllegalArgumentException("Days borrowed must be >= 1.");
        }
        this.uniqueID = uniqueID;
        this.title = title;
        this.author = author;
        this.borrowedDay = borrowedDay;
    }

    public LibraryItem(String uniqueID, String title, String author) {
        this(uniqueID, title, author, 1);
    }

    
    public String getUniqueID() {
        return uniqueID;
    }


    public String getTitle() {
        return title;
    }


    public String getAuthor() {
        return author;
    }


    public int getBorrowedDay() {
        return borrowedDay;
    }


    public abstract double calculateFee();
    public void displayInfo(){
        System.out.println("Unique ID: " + uniqueID);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("The number of days borrowed: " + borrowedDay);
    }
}

class PrintedBook extends LibraryItem{
    private int pages;

    public PrintedBook(String uniqueID, String title, String author, int borrowedDay, int pages) {
        super(uniqueID, title, author, borrowedDay);
        if(pages<1){
            throw new IllegalArgumentException("Page must be >= 1.");
        }
        this.pages = pages;
    }


    @Override
    public double calculateFee(){
        return 5000*this.getBorrowedDay() + 10*pages;
    }
    @Override
    public void displayInfo(){
        super.displayInfo();
        System.out.println("The number of pages: " + pages);
        System.out.println("Its fee: " + String.format("%,.0f", this.calculateFee()) + " VND");
    }   
}

class Magazine extends LibraryItem{
    private int issue;

    public Magazine(String uniqueID, String title, String author, int borrowedDay, int issue) {
        super(uniqueID, title, author, borrowedDay);
        if(issue<1){
            throw new IllegalArgumentException("Issue must be >= 1.");
        }
        this.issue = issue;
    }


    @Override
    public double calculateFee(){
        return 3000*this.getBorrowedDay() + 2000;
    }
    @Override
    public void displayInfo(){
        super.displayInfo();
        System.out.println("Issue: " + issue);
        System.out.println("Its fee: " + String.format("%,.0f", this.calculateFee()) + " VND");
    } 
}

class Main{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<LibraryItem> items = new ArrayList<>();
        
        int choice;
        do {
            System.out.println("\n===MENU===");
            System.out.println("1.Add items");
            System.out.println("\n2.Display each item and its fee");
            System.out.println("\n3.Search by item ID");
            System.out.println("\n4.Count the number of each type");                   
            System.out.println("\n5.Total borrowing revenue");                   
            System.out.println("\n6.Find the item with the highest fee");    
            System.out.println("\n7.Exit");
            System.out.println("==========");
            System.out.print("\nEnter your choice: ");
            choice = Integer.parseInt(input.nextLine());

            if(choice == 1){
                System.out.println("===Add items===");
                System.out.print("Enter the number of item (>=1): ");
                int n = Integer.parseInt(input.nextLine());
                while(n<1){
                    System.out.print("Inavalid the number of item(n>=1). Please enter again : ");
                    n = Integer.parseInt(input.nextLine());
                }
                

                for(int i=0; i<n;i++){

                    System.out.print("Choose the Item Type (1.PrintedBook / 2.Magazine): ");
                    int type = Integer.parseInt(input.nextLine());
                    if(type !=1 && type !=2){
                    System.out.print("Invalid type.");
                    i--;
                    continue;
                    }

                    System.out.print("Unique ID: ");
                    String uniqueID = input.nextLine();
                    while(true){
                        boolean checkID=false;
                        for(LibraryItem item:items){
                            if(uniqueID.equalsIgnoreCase(item.getUniqueID())){
                                checkID=true;
                            }
                        }

                        if(uniqueID.trim().isEmpty()){
                            System.out.print("ID must not be empty. Enter again: ");
                            uniqueID = input.nextLine();
                        }
                        else if(checkID){
                            System.out.print("Duplicate unique ID. Enter again: ");
                            uniqueID = input.nextLine();
                        }
                        else{
                            break;
                        }
                    }

                    System.out.print("Title: ");
                    String title = input.nextLine();
                    System.out.print("Author: ");
                    String author = input.nextLine();
                    System.out.print("The number of days borrowed(>=1): ");
                    int borrowedDay = Integer.parseInt(input.nextLine());
                    while(borrowedDay < 1){
                        System.out.print("Invalid the number of days borrowed(>=1). Please enter again: ");
                        borrowedDay = Integer.parseInt(input.nextLine());
                    }

                    if(type ==1){
                        System.out.print("The number of pages(>=1): ");
                        int pages = Integer.parseInt(input.nextLine());
                        while(pages < 1){
                            System.out.print("Invalid the number of pages(>=1). Please enter again: ");
                            pages = Integer.parseInt(input.nextLine());
                        }
                        items.add(new PrintedBook(uniqueID, title, author, borrowedDay, pages));
                        
                    }
                    else{
                        System.out.print("Issue(>=1): ");
                        int issue = Integer.parseInt(input.nextLine());
                        while(issue < 1){
                            System.out.print("Invalid issue(>=1). Please enter again: ");
                            issue = Integer.parseInt(input.nextLine());
                        }
                        items.add(new Magazine(uniqueID, title, author, borrowedDay, issue));
                        
                    }
                
                }

            }
            else if(choice == 2){
                System.out.println("\n===Display each item and its fee===");
                int index=1;
                if(items.isEmpty()){
                    System.out.println("\nEmpty Array");
                }
                else{
                    for(LibraryItem item: items){
                        System.out.println("\nItem " + index);
                        item.displayInfo();
                        index++;
                    }
                }
            }
            else if(choice == 3){
                System.out.println("\n===Search by item ID===");
                System.out.print("\nEnter item ID to search: ");
                String seachId = input.nextLine();
                    boolean checkSearch = false;
                    for(LibraryItem item: items){
                        if(seachId.equalsIgnoreCase(item.getUniqueID())){
                            item.displayInfo();
                            checkSearch=true;
                            break;
                        }
                    }
                    if(checkSearch==false){
                        System.out.println("Item does not exist.");
                    }
            }
            else if(choice == 4){
                int countPrint =0;
                int countMagazine=0;
                System.out.println("\n===Count the number of each type==="); 
                for(LibraryItem item: items){
                    if(item instanceof PrintedBook){
                        countPrint++;
                    }
                    if(item instanceof Magazine){
                        countMagazine++;
                    }
                }
                System.out.println("\nPrintedBook: " + countPrint);
                System.out.println("\nMagazine: " + countMagazine);
            }
            else if(choice == 5){
                double revenue=0;
                for(LibraryItem item: items){
                    revenue+=item.calculateFee();
                }
                System.out.println("\nTotal borrowing revenue: " + String.format("%,.0f",revenue) + " VND");
            }
            else if(choice == 6){
                if(items.isEmpty()){
                    System.out.println("Empty Array.");
                }
                else{
                    LibraryItem highest= items.get(0);
                    for(LibraryItem item:items){
                        if(item.calculateFee() > highest.calculateFee()){
                            highest =item;
                        }
                    }
                    System.out.println("\nThe item has the highest fee with the fee is: " + 
                    String.format("%,.0f", highest.calculateFee()) +" VND");
                    highest.displayInfo();
                }
            }
            else if(choice == 7){
                System.out.println("Goodbye!");
            }
            else{
                System.out.println("Invalid choice.");
            }
        } while (choice !=7);
        input.close();
    }

}