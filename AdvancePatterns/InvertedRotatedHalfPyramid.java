import java.util.*;

public class InvertedRotatedHalfPyramid {
    public static void invertedRotatedHalfPyramid(int n) {
        // outer loop(1 to n)
        for (int i = 1; i <= n; i++) {
            // inner loop
            // spaces
            for (int j = 1; j <= (n - i); j++) {
                System.out.print(" ");
            }
            // star
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enetr n:");
        int n = sc.nextInt();
        invertedRotatedHalfPyramid(n);
    }

}
