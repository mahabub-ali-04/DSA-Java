package Basic;

import java.util.*;

public class LeapYear {
    public static void leapYear(int year) {
        boolean x = (year % 4 == 0);
        boolean y = (year % 100 != 0);
        boolean z = (year % 100 == 0) && (year % 400 == 0);

        if (x && (y || z)) {
            System.out.println(year + " is leap year");
        } else {
            System.out.println(year + " is not leap year");
        }

    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Year:");
        int year = sc.nextInt();
        leapYear(year);
    }

}
