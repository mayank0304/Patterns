
import java.util.Scanner;

public class Pattern01 {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the height of pattern: ");
            int a = sc.nextInt();

            for (int i = 0; i < a; i++) {
                for (int j = 0; j < a; j++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
        }
    }
}
