
import java.util.Scanner;

public class Pattern12 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the height of pattern: ");
        int a = sc.nextInt();

        int b = 2 * a - 2;

        for (int i = 1; i <= a; i++) {

            // numbers 
            for (int n = 1; n <= i; n++) {
                System.out.print(n);
            }

            // space
            for (int s = 1; s <= b; s++) {
                System.out.print(" ");
            }

            // numbers
            for (int n = i; n >= 1; n--) {
                System.out.print(n);
            }
            b -= 2;
            System.out.println();
        }
    }
}
