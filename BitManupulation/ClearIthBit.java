package BitManupulation;

import java.util.*;

public class ClearIthBit {
    public static int clearIthBit(int n, int i) {
        int bitMask = ~(1 << i);
        return n & bitMask;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enetr n:");
        int n = sc.nextInt();
        System.out.print("Enetr ith bit:");
        int i = sc.nextInt();
        System.out.println(clearIthBit(n, i));
    }

}
