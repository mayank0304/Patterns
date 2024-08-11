
import java.util.Scanner;


public class Pattern13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the height of pattern: ");
        int a = sc.nextInt();

        int b = 1;

        for (int i = 0; i < a; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(b + " ");
                b++;
            }
            System.out.println();
        }
    }
}
