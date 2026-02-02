package BitManupulation;
import java.util.*;
public class SetIthBit {
    public static int setIthBit(int n, int i) {
        int bitMask = (1 << i);
        return n | bitMask;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n:");
        int n = sc.nextInt();
        System.out.print("Enetr ith bit:");
        int i = sc.nextInt();
        System.out.println(setIthBit(n, i));

    }

}
