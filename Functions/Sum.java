package Functions;

import java.util.*;

public class Sum {
    public static int sum(int a, int b) {
        return a + b;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enetr a:");
        int a = sc.nextInt();
        System.out.print("Enetr b:");
        int b = sc.nextInt();
        System.out.println(sum(a, b));
    }

}
