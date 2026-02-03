package Functions;

import java.util.*;

public class BinToDec {
    public static int binToDec(int binNum) {
        // int myNum = binNum;
        int pow = 0;
        int decNum = 0;
        while (binNum > 0) {
            int lastDigit = binNum % 10;
            decNum = decNum + (lastDigit * (int) Math.pow(2, pow));
            pow++;
            binNum = binNum / 10;
        }
        return decNum;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter n:");
        int n = sc.nextInt();
        System.out.println("bin to dec is:"+binToDec(n));
    }
}
