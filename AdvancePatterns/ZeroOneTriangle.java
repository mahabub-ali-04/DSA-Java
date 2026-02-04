import java.util.*;

public class ZeroOneTriangle {
    public static void zeroOneTriangle(int n) {
        // inner loop
        for (int i = 1; i <= n; i++) {
            // inner loop
            for (int j = 1; j <= i; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.print("1");
                } else {
                    System.out.print("0");
                }
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n:");
        int n = sc.nextInt();
        zeroOneTriangle(n);
    }

}
