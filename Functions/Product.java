package Functions;

import java.util.*;

public class Product {
    public static int product(int a, int b) {
        return a * b;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enetr a:");
        int a = sc.nextInt();
        System.out.println("Enetr b:");
        int b = sc.nextInt();
        System.out.println(product(a, b));

    }

}
