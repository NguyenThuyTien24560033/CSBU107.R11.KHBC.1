import java.util.Scanner;

public class question_08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = input.nextInt();

        double[] a = new double[n];
        System.out.println("Enter timestamps:");
        for (int i = 0; i < n; i++) {
            a[i] = input.nextDouble();
        }

        System.out.print("Enter base damage x: ");
        double x = input.nextDouble();

        System.out.print("Enter stack damage y: ");
        double y = input.nextDouble();

        System.out.print("Enter quill duration z: ");
        double z = input.nextDouble();

        double totalDamage = 0.0;

        for (int i = 0; i < n; i++) {
            int k = 0;

            for (int j = 0; j < i; j++) {
                if (a[i] - a[j] <= z) {
                    k++;
                }
            }

            totalDamage += x + (k * y);
        }

        System.out.print("Total damage: ");
        System.out.println(totalDamage);

        input.close();
    }
}