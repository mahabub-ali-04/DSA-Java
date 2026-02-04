import java.util.*;

public class FloydsTriangle {
    public static void floydsTriangle(int n) {
        int count = 1;
        // outer loop
        for (int i = 1; i <= n; i++) {
            // inner loop
            for (int j = 1; j <= i; j++) {
                System.out.print(count+" ");
                count++;
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n:");
        int n = sc.nextInt();
        floydsTriangle(n);
    }

}
