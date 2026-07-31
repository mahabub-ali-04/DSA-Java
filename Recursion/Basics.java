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

    // check if a array is sorted or not
    public static boolean isSorted(int arr[], int i) {
        if (i == arr.length - 1) { // base case
            return true;
        }
        if (arr[i] > arr[i + 1]) {
            return false;
        }
        return isSorted(arr, i + 1);
    }

    // WAF to find the first occurence of an element in an array
    public static int firstOccurence(int arr[], int key, int i) {
        if (i == arr.length) {
            return -1;
        }
        if (arr[i] == key) {
            return i;
        }
        return firstOccurence(arr, key, i + 1);
    }

    // WAF to find the last occurence of an element in an array
    public static int lastOccurence(int arr[], int key, int i) {
        if (i == arr.length) {
            return -1;
        }
        int isFound = lastOccurence(arr, key, i + 1);
        if (isFound == -1 && arr[i] == key) {
            return i;
        }
        return isFound;
    }

    // WAF to print x to the power n
    public static int power(int x, int n) {
        if (n == 0) {
            return 1;
        }
        // int xnm1 = power(x, n-1);
        // int xn = x * xnm1;
        // return xn;
        return x * power(x, n - 1);
    }

    // optimized power

    public static int optimizedPower(int x, int n) {
        if (n == 0) {
            return 1;
        }
        int halfPower = power(x, n / 2);
        int halfPowerSqr = halfPower * halfPower;
        // if odd
        if (n % 2 != 0) {
            halfPowerSqr = x * halfPowerSqr;
        }
        return halfPowerSqr;
    }

    // Tilling Problem

    public static int tillingproblem(int n) { // 2 * n
        if (n == 0 || n == 1) {
            return 1;
        }
        // Choice
        // Vertical
        int fnm1 = tillingproblem(n - 1);

        // Horizontal
        int fnm2 = tillingproblem(n - 2);
        int totWays = fnm1 + fnm2;
        return totWays;
    }

    // Remove Duplicates
    public static void removeDuplicates(String str, StringBuilder newStr, int idx, boolean map[]) {
        // Base Case
        if (idx == str.length()) {
            System.out.println(newStr);
            return;
        }
        // Kaam
        char currChar = str.charAt(idx);
        if (map[currChar - 'a'] == true) {
            // Duplicates
            removeDuplicates(str, newStr, idx + 1, map);
        } else {
            map[currChar - 'a'] = true;
            removeDuplicates(str, newStr.append(currChar), idx + 1, map);
        }

    }

    // Friends Pairing Problem
    public static int friendsPairingProblem(int n) {
        // Base Case
        if (n == 1 || n == 2) {
            return n;
        }
        // Choice
        // Single
        // int fnm1 = friendsPairingProblem(n - 1);
        // pairing
        // int fnm2 = (n - 1) * friendsPairingProblem(n - 2);
        // int totWays = fnm1 + fnm2;
        return friendsPairingProblem(n - 1) + (n - 1) * friendsPairingProblem(n - 2);
    }

    public static void main(String args[]) {
        int n = 5;
        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 5 };
        String str = "programming";
        // printDec(n);
        // printIncreasing(n);
        // System.out.println(factorial(n));
        // System.out.println(sumNaturalNum(n));
        // System.out.println(fib(n));
        // System.out.println(isSorted(arr, 0));
        // System.out.println(firstOccurence(arr, 5, 0));
        // System.out.println(lastOccurence(arr, 5, 0));
        // System.out.println(power(2, 10));
        // System.out.println(optimizedPower(2, 5));
        // System.out.println(tillingproblem(4));
        // removeDuplicates(str, new StringBuilder(""), 0, new boolean[26]);
        System.out.println(friendsPairingProblem(2));
    }

}
