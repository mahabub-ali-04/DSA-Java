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

    public static void main(String args[]) {
        int n = 5;
        // printDec(n);
        printIncreasing(n);
    }

}
