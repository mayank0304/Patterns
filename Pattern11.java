
import java.util.Scanner;


public class Pattern11 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the height of pattern: ");
            int a = sc.nextInt();

            for (int i = 0; i < a; i++) {
                for (int j = 0; j <= i; j++) {
                    if(i%2 == 0) {
                        if(j%2 == 0) {
                            System.out.print("1");
                        } else {
                            System.out.print("0");
                        }
                    } else {
                        if(j%2 == 0) {
                            System.out.print("0");
                        } else {
                            System.out.print("1");
                        }
                    }
                }
                System.out.println();
            }
        }
    }
}
