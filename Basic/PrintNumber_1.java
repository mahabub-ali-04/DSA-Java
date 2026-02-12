package Basic;

import java.util.*;
// display all number entered by users except multiple of 10
public class PrintNumber_1 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("Enter n:");
            int n = sc.nextInt();
            if (n % 10 == 0) {
                continue;
            }
            System.out.println(n);
        }
    }

}
