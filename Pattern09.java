import java.util.Scanner;

public class Pattern09 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the height of pattern: ");
            int b = sc.nextInt();
            int a = b / 2;
            for (int i = 0; i < a; i++) {
                // For space
                for (int j = 0; j < a - i - 1; j++) {
                    System.out.print(" ");
                }

                // for star pattern
                for (int k = 0; k <= 2 * i ; k++) {
                    System.out.print("*");
                }
                System.out.println();
            }

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
}
