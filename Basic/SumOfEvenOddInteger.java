package Basic;

import java.util.*;

public class SumOfEvenOddInteger {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int choice = 1;
        int evenSum = 0;
        int oddSum = 0;
        while (choice == 1) {
            System.out.print("Enter n:");
            int n = sc.nextInt();
            if (n % 2 == 0) {
                evenSum += n;
            } else {
                oddSum += n;
            }
            System.out.print("Do you want to continue ? press 1 , 0 for no ");
            choice = sc.nextInt();
        }
        System.out.println(evenSum);
        System.out.println(oddSum);
    }

}
