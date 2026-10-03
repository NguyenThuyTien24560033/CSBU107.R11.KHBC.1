import java.util.Scanner;

public class question_05{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int a = input.nextInt();

        System.out.print("Multiplication ");
        System.out.println(a);

        for(int i=1; i<11; i++){
            System.out.print(a);
            System.out.print("x");
            System.out.print(i);
            System.out.print("=");
            System.out.print(a*i);
            System.out.println("");
        }

        input.close();
    }
}