import java.util.*;

public class InvertedHalfPyramid {
    public static void halfPyramidWithNumber(int n) {
        // inverted half pyramid with number
        // outer loop
        for (int i = 1; i <= n; i++) {
            // inner loop
            for (int j = 1; j <= (n - i + 1); j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n:");
        int n = sc.nextInt();
        halfPyramidWithNumber(n);
    }

}
