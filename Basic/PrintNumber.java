package Basic;

import java.util.*;

public class PrintNumber {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n:");
        int n = sc.nextInt();
        int count = 1;
        while (count <= n) {
            System.out.print(count+" ");
            count++;
        }
        System.out.println();
    }

}
