
import java.util.Scanner;

public class Pattern15 {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the height of pattern: ");
            int a = sc.nextInt();

            char b = 'A';

            for (int i = 0; i < a; i++) {
                for (int j = 0; j <= i; j++) {
                    System.out.print(b);
                }
                b++;
                System.out.println();
            }
        }
    }
}
