import java.util.Scanner;

public class question_07{

    public static int[] merge(int[] a1, int[] a2){
        int n1 = a1.length;
        int n2 = a2.length;
        int[] a3 = new int[n1 + n2];
        
        int i = 0, j = 0, k = 0;

        while (i < n1 && j < n2) {
            if (a1[i] < a2[j]) {
                a3[k] = a1[i];
                i++;
            } else {
                a3[k] = a2[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            a3[k] = a1[i];
            i++;
            k++;
        }

        while (j < n2) {
            a3[k] = a2[j];
            j++;
            k++;
        }

        return a3;
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Size 1: ");
        int size1 = input.nextInt();
        
        int[] a1 = new int[size1];
        System.out.println("Enter elements for array 1:");
        for (int i = 0; i < size1; i++) {
            a1[i] = input.nextInt();
        }


        System.out.print("Size 2: ");
        int size2 = input.nextInt();

        int[] a2 = new int[size2];
        System.out.println("Enter elements for array 2:");
        for (int i = 0; i < size2; i++) {
            a2[i] = input.nextInt();
        }
       
        int[] result = merge(a1, a2);

        for (int i = 0; i < size1+size2; i++) {
            System.out.print(result[i]);
             System.out.print(" ");
        }

    }
}