package Recursion;

public class Basics {
    // print number in decreasing order
    public static void printDec(int n) {
        if (n == 1) {
            System.out.print(n);
            return;
        }
        System.out.print(n + " ");
        printDec(n - 1);
    }

    // print number in increasing order
    public static void printIncreasing(int n) {
        if (n == 1) {
            System.out.println(n);
            return;
        }
        printIncreasing(n - 1);
        System.out.println(n);
    }

    // print factorial of a number

    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        }
        int fnm1 = factorial(n - 1);
        int fn = n * fnm1;
        return fn;
    }

    public static void main(String args[]) {
        int n = 5;
        // printDec(n);
        // printIncreasing(n);
        System.out.println(factorial(n));
    }

}
