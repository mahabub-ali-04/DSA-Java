package Basic;

import java.util.*;
// keep entering number untill user enter multiple of 10
public class PrintMultipleOf_10 {
    public static void main(String args[]) {
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter n:");
            int n = sc.nextInt();
            if (n % 10 == 0) {
                break;
            }
            System.out.println(n);
        }
    }

}
