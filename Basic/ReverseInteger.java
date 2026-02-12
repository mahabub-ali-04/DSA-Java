package Basic;

import java.util.*;

public class ReverseInteger {
    public static int reverseInteger(int n) {
        int rev = 0;
        while (n != 0) {
            int lastDigit = n % 10;
            n = n / 10;
            if (rev > Integer.MAX_VALUE / 10 || rev < Integer.MIN_VALUE / 10) {
                return 0;
            }
            rev = rev * 10 + lastDigit;
        }
        return rev;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n:");
        int n = sc.nextInt();
        System.out.println(reverseInteger(n));
    }

}
