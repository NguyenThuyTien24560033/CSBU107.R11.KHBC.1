import java.util.Scanner;

public class question_04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Initial string: ");
        String a = input.nextLine();
        String reversed = "";

        for (int i = a.length() - 1; i >= 0; i--) {
            reversed += a.charAt(i);
        }

        System.out.println("Reversed string:");
        System.out.print(reversed);

        input.close();
    }
}