import java.util.Scanner;

public class question_03{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int a = input.nextInt();
        int sum = 0;
        if(a<0){
            a*=-1;
        }
        while(a>0){
            sum += a%10;
            a /=10;
        }
        System.out.print("Sum is: ");
        System.out.print(sum);
        input.close();
    }
}
