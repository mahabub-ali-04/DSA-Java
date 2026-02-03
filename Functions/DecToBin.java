package Functions;

import java.util.*;

public class DecToBin {
    public static int decToBin(int decNum) {
        int pow = 0;
        int binNum = 0;
        while (decNum > 0) {
            int rem = decNum % 2;
            binNum = binNum + (rem * (int) Math.pow(10, pow));
            pow++;
            decNum = decNum / 2;

        }
        return binNum;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enetr n:");
        int n = sc.nextInt();
        System.out.println("Dec to Bin is: " + decToBin(n));
    }

}
