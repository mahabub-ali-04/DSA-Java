package Functions;

import java.util.*;

public class BinCoeff {
    public static int factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }
        return fact;
    }

    public static int binCoeff(int n, int r) {
        int n_fact = factorial(n);
        int r_fact = factorial(r);
        int nmr_fact = factorial(n - r);
        int binCoefficient = (n_fact) / (r_fact * nmr_fact);
        return binCoefficient;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enetr n:");
        int n = sc.nextInt();
        System.out.print("Enter r:");
        int r = sc.nextInt();
        System.out.println(binCoeff(n, r));
    }

}
