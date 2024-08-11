import java.util.Scanner;

public class Pattern8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the height of pattern: ");
        int a = sc.nextInt();

        for (int i = a; i > 0; i--) {
            // For space
            for (int j = 0; j < a - i; j++) {
                System.out.print(" ");
            }

            // for stars
            for (int k = 0; k <= 2 * i - 2; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
