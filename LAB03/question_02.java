import java.util.ArrayList;
import java.util.Scanner;

abstract class Ticket{
    private String ticketID;
    private String holderName;
    private int yearOfBirth;
    private int gamePlayed; 

    Ticket(String ticketID, String holderName, int yearOfBirth, int gamePlayed){
        this.ticketID = ticketID;
        this.holderName = holderName;
        this.yearOfBirth = yearOfBirth;
        this.gamePlayed = gamePlayed;
    };

    public abstract double calculatePrice();

    public int getPlayed(){
        return gamePlayed;
    }


}

class FullPackageTicket extends Ticket{
    private double price;

    FullPackageTicket(String ticketID, String holderName, int yearOfBirth, int gamePlayed){
        super(ticketID, holderName, yearOfBirth, gamePlayed);
    }

    @Override
    public double calculatePrice(){
        return 200000;
    }
};

class Partial extends Ticket{
    private double price;
    Partial(String ticketID, String holderName, int yearOfBirth, int gamePlayed){
        super(ticketID, holderName, yearOfBirth, gamePlayed);
    }

    @Override
    public double calculatePrice(){
       return 70000 + 20000 * getPlayed();
    }
};

class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        ArrayList<Ticket> tickets = new ArrayList<>();

        System.out.print("\nEnter the number of ticket: " );
        int n = Integer.parseInt(input.nextLine());

        for(int i=0; i<n; i++){
            System.out.print("\nTicket " +(i+1));
            System.out.println("\nType(1-Full Package, 2-Partial)");
            int type = Integer.parseInt(input.nextLine());

            if(type !=1 && type !=2){
                System.out.print("\nInvalid ticket type");
                i--;
                continue;
            }

            System.out.print("\nThe ticket ID: ");
            String ticketID = input.nextLine();

            System.out.print("\nThe holder name: ");
            String holderName = input.nextLine();

            int yearOfBirth;
            do{
                System.out.print("\nThe year of birth: ");
                yearOfBirth = Integer.parseInt(input.nextLine());

                if(yearOfBirth < 1900 || yearOfBirth > 2026){
                    System.out.println("Invalid year of birth! Enter a year from 1900 to 2026.");
                }
            }while(yearOfBirth < 1900 || yearOfBirth > 2026);

            if(type == 1){
                tickets.add(new FullPackageTicket(ticketID, holderName, yearOfBirth, 30));
            }
            else{
                int gamePlayed;

                do{
                    System.out.print("\nThe game played: ");
                    gamePlayed = Integer.parseInt(input.nextLine());

                    if(gamePlayed < 1 || gamePlayed > 30){
                        System.out.println("Invalid number of games! Enter a value from 1 to 30.");
                    }
                }while(gamePlayed < 1 || gamePlayed > 30);

                tickets.add(new Partial(ticketID, holderName, yearOfBirth, gamePlayed));
            }

        }

        double totalRevenue = 0;
        for(Ticket t: tickets){
            totalRevenue += t.calculatePrice();
        }

        System.out.println("\nTotal Revenue: " + totalRevenue + "VND");

        int count =0;
        for(Ticket t: tickets){
            if(t instanceof Partial){
                count++;
            }
        }

        System.out.print("\nThe number of partial ticket: " + count + " tickets");

        input.close();
    }
};