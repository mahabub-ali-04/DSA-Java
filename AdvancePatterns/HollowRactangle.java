
import java.util.*;

public class HollowRactangle {
    public static void hollowRactangle(int totRows, int totCols) {
        for (int i = 1; i <= totRows; i++) {
            for (int j = 1; j <= totCols; j++) {
                if (i == 1 || i == totRows || j == 1 || j == totCols) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enetr totRow:");
        int totRows = sc.nextInt();
        System.out.print("Enetr totCols:");
        int totCols = sc.nextInt();
        hollowRactangle(totRows, totCols);
    }

}
