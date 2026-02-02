package BitManupulation;

import java.util.*;

public class ClearLastIbit {
    public static int clearLastIBit(int n, int i) {
        int bitMask = (-1 << i);
        return n & bitMask;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enetr n:");
        int n = sc.nextInt();
        System.out.print("Enetr last ith bit:");
        int i = sc.nextInt();
        System.out.println(clearLastIBit(n, i));
    }

}
