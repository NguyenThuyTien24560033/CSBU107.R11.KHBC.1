import java.util.Scanner;

public class question_06{
    public static void main(String[] args){
        Scanner input= new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = input.nextInt();
        int[] a = new int[n];
        System.out.print("Enter the array: ");
        for(int i=0; i<n; i++){
            a[i] = input.nextInt();
        }
        System.out.print("Enter the target value: ");
        int x = input.nextInt();

        for(int i=0; i<n; i++){
            if(a[i] == x){
                System.out.print(i);
                return;
            }
        }
        System.out.print(-1);

        input.close();
    }
}