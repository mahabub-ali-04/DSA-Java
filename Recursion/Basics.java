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

    // print sum of first n natural number
    public static int sumNaturalNum(int n) {
        if (n == 1) {
            return 1;
        }
        int Snm1 = sumNaturalNum(n - 1);
        int Sn = n + Snm1;
        return Sn;
    }

    // print nth fibonacci number
    public static int fib(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        int fnm1 = fib(n - 1);
        int fnm2 = fib(n - 2);
        int fn = fnm1 + fnm2;
        return fn;
    }

    public static void main(String args[]) {
        int n = 5;
        // printDec(n);
        // printIncreasing(n);
        // System.out.println(factorial(n));
        // System.out.println(sumNaturalNum(n));
        System.out.println(fib(n));
    }

}
