import java.util.ArrayList;
import java.util.Scanner;

abstract class Person{
    private String fullName;
    private int age;

    Person(String fullName, int age){
        this.fullName = fullName;
        this.age = age;
    };

    public String getName(){
        return fullName;
    }

    public int getAge(){
        return age;
    }

    public abstract void displayInfor();
};

class Staff extends Person{
    private String LicenseID;
    private String employeeID;

    Staff(String fullName, int age, String LicenseID, String employeeID){
        super(fullName, age);
        this.LicenseID = LicenseID;
        this.employeeID = employeeID;
    };

    @Override
    public void displayInfor(){
        System.out.print("\nThe full name: " + getName());
        System.out.print("\nThe age: "+ getAge());
        System.out.print("\nThe License ID: " + this.LicenseID);
        System.out.print("\nThe employee ID: " + this.employeeID);
    };
};

class Guest extends Person{
    private String CitizenID;

    Guest(String fullName, int age, String CitizenID){
        super(fullName, age);
        this.CitizenID = CitizenID;
    };

    public String getCitizenID() {
        return CitizenID;
    }

    @Override
    public void displayInfor(){
        System.out.print("\nThe full name: " + getName());
        System.out.print("\nThe age: "+ getAge());
        System.out.print("\nThe Citizen ID: " + this.CitizenID);
    };
};

class Room{
    private String roomType;
    private int day;

    Room(String roomType, int day){
        this.roomType = roomType;
        this.day = day;
    }

    public double calculatePrice(){
        double dailyPrice = 0;

        if(roomType.equals("VIP1")){
            dailyPrice = 900000;
        }

        if(roomType.equals("VIP2")){
            dailyPrice = 700000;
        }

        if(roomType.equals("VIP3")){
            dailyPrice = 500000;
        }

        return dailyPrice*day;
    }

};

class Main{
    public static void addGuest(ArrayList<Guest> guests, Scanner input){
        System.out.print("\nThe full name: ");
        String fullName = input.nextLine();

        System.out.print("\nThe age: ");
        int age = Integer.parseInt(input.nextLine());

        System.out.print("\nThe Citizen ID: ");
        String CitizenID = input.nextLine();

        guests.add(new Guest(fullName, age, CitizenID));

        System.out.println("Guest added successfully!");
    }

    public static void removeGuest(ArrayList<Guest> guests, String cccd){
        boolean found = false;

        for(int i=0; i<guests.size(); i++){
            if(guests.get(i).getCitizenID().equals(cccd)){
                guests.remove(i);
                found = true;
                System.out.println("Guest removed successfully!");
                break;
            }
        }

        if(found == false){
            System.out.println("Guest not found!");
        }
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        ArrayList<Guest> guests = new ArrayList<>();
        ArrayList<Staff> staffs = new ArrayList<>();

        System.out.print("\nEnter the number of people: ");
        int n = Integer.parseInt(input.nextLine());

        for(int i=0; i<n; i++){
            System.out.print("\nThe type person(1-Guest, 2-Staff): ");
            int type = Integer.parseInt(input.nextLine());

            if(type!=1 && type!=2){
                System.out.print("Invalid type person");
                i--;
                continue;
            }

            System.out.print("\nThe full name: ");
            String fullName = input.nextLine();

            System.out.print("\nThe age: ");
            int age = Integer.parseInt(input.nextLine());

            if(type ==1 ){
                System.out.print("\nThe Citizen ID: ");
                String CitizenID = input.nextLine();
                guests.add(new Guest(fullName, age, CitizenID));
            }

            else {
                System.out.print("The License ID: ");
                String licenseID = input.nextLine();

                System.out.print("The Employee ID: ");
                String employeeID = input.nextLine();

                staffs.add(new Staff(fullName, age, licenseID, employeeID));
            }

        }

        for(Guest p: guests){
            p.displayInfor();
        };

        System.out.print("\nDo you want to add a guest? (1-Yes, 2-No): ");
        int addChoice = Integer.parseInt(input.nextLine());

        if(addChoice == 1){
            addGuest(guests, input);
        }

        System.out.print("\nDo you want to remove a guest? (1-Yes, 2-No): ");
        int choice = Integer.parseInt(input.nextLine());

        if(choice ==1){
            System.out.print("Enter Citizen ID to remove: ");
            String removeID = input.nextLine();

            removeGuest(guests, removeID);

            System.out.println("The list of guests: ");
            for(Guest p: guests){
                p.displayInfor();
            };
        };

        for(Guest p: guests){
            System.out.println("\nROOM");
            System.out.println("\nRoom type:");
            System.out.println("VIP1 (900000 VND/day)");
            System.out.println("VIP2 (700000 VND/day)");
            System.out.println("VIP3 (500000 VND/day)");
            System.out.print("\nChoose the type of room(1-VIP1, 2-VIP2, 3-VIP3): ");
            int tRoom = Integer.parseInt(input.nextLine());

            String roomType="";
            if(tRoom ==1){
                roomType="VIP1";
            }
            else if(tRoom ==2){
                roomType="VIP2";
            }
            else if(tRoom ==3){
                roomType="VIP3";
            }
            else{
                System.out.println("Invalid room type");
                continue;
            }

            int day;

            do{
                System.out.print("\nThe rental day: ");
                day = Integer.parseInt(input.nextLine());

                if(day <= 0){
                    System.out.println("Invalid rental day!");
                }
            }while(day <= 0);

            Room room = new Room(roomType, day);
            System.out.println("\nGuest name: " + p.getName());
            System.out.println("The rental cost is " + room.calculatePrice() + "VND");
        }

        input.close();
    }
};