import java.util.Scanner;

public class Pattern1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
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