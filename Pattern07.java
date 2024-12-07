import java.util.Scanner;

public class Pattern07 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the height of pattern: ");
            int a = sc.nextInt();
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
        }
    }
}
