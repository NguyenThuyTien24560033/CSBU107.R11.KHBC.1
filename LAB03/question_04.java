import java.util.Scanner;
import java.util.ArrayList;

abstract class Singer{
    private  String fullName;
    private int yearsOE;
    private int albumsSold;
    private int performances;

    Singer(String fullName, int yearsOE, int albumsSold, int performances){
        this.fullName = fullName;
        this.yearsOE = yearsOE;
        this.albumsSold = albumsSold;
        this.performances = performances;
    }
    public String getName(){
        return fullName;
    };

    public int getYears(){
        return yearsOE;
    };
    public int getAlbums(){
        return albumsSold;
    };
    public int getPerformances(){
        return performances;
    };

    public abstract double calculateSalary();

    public abstract void display();
};
class RegularSinger extends Singer{

    RegularSinger(String fullName, int yearsOE, 
                int albumsSold, int performances){
        super(fullName, yearsOE, albumsSold, performances);
    }  
 
    @Override
    public double calculateSalary(){
        return 3000000 + 500000*getYears() + 1000*getAlbums() + 200000*getPerformances();
    };

    @Override
    public void display(){
        System.out.print("\nThe full name: " + getName());
        System.out.print("\nThe years of experience: " + getYears());
        System.out.print("\nThe number of albums sold: " + getAlbums());
        System.out.print("\nThe number of performances: "+getPerformances());
    };
};
class FamousSinger extends Singer{
    private int gameShows;

    FamousSinger(String fullName, int yearsOE, 
                int albumsSold, int performances, int gameShows){
        super(fullName, yearsOE, albumsSold, performances);
        this.gameShows = gameShows;
    }    

    @Override
    public double calculateSalary(){
        return 5000000 + 500000*getYears() + 1200*getAlbums() 
            + 500000*getPerformances() + 500000*this.gameShows;
    };

    @Override
    public void display(){
        System.out.print("\nThe full name: " + getName());
        System.out.print("\nThe years of experience: " + getYears());
        System.out.print("\nThe number of albums sold: " + getAlbums());
        System.out.print("\nThe number of performances: "+getPerformances());
        System.out.print("\nThe number of game shows attended: "+this.gameShows);
    };

};
class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        ArrayList<Singer> singers = new ArrayList<>();
        System.out.println("\nEnter the number of singer: ");
        int n = Integer.parseInt(input.nextLine());

        for(int i=0; i<n; i++){
            System.out.println("\nSinger Type(1-Regular Singer, 2-Famous Singer)");
            int type= Integer.parseInt(input.nextLine());

            if(type!=1 &&type!=2){
                System.out.print("\nInvalid singer type");
                i--;
                continue;
            }

            System.out.print("\nThe full name: ");
            String fullName = input.nextLine();
    
            System.out.print("\nThe years of experience: ");
            int yearsOE = Integer.parseInt(input.nextLine());

            System.out.print("\nThe number of albums sold: ");
            int albumsSold = Integer.parseInt(input.nextLine()) ;

            System.out.print("\nThe number of performances: ");
            int performances = Integer.parseInt(input.nextLine()) ;

            if(type == 2){
                System.out.print("\nThe number of game shows attended: ");
                int gameShows = Integer.parseInt(input.nextLine()) ;

                singers.add(new FamousSinger(fullName, yearsOE, 
                        albumsSold, performances, gameShows));
            }
            else{
                singers.add(new RegularSinger(fullName, yearsOE, albumsSold, performances));
            }

            
        };

        double salaryFamous =0;
        double salaryRegular =0;
        double max=0;
        Singer highest = null;
        for(Singer s :singers){

            if(s instanceof FamousSinger){
                salaryFamous+= s.calculateSalary();
            }
            else{
                salaryRegular+= s.calculateSalary();
            }
            if(s.calculateSalary()>= max){
                max=s.calculateSalary();
                highest = s;
            }
        };

        System.out.printf("\nThe salary of famous singer category: %,.0f VND\n", salaryFamous);
        System.out.printf("\nThe salary of regular singer category: %,.0f VND\n", salaryRegular);
        if(highest != null){
            System.out.println("\nHighest-paid singer:");
            highest.display();
            System.out.printf("\nSalary: %,.0f VND\n", max);
        }
         

        input.close();
    }
}