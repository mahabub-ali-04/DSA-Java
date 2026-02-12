package Basic;

import java.util.*;

public class SumOfNaturalNumber {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n:");
        int n = sc.nextInt();
        int sum = 0;
        int count = 1;
        while (count <= n) {
            sum += count;
            count++;
        }
        System.out.println(sum);
    }

}
