import java.util.Collections;
import java.util.Arrays;

public class InbuildSort {
    public static void inbuiltSort(Integer nums[]) {
        for (Integer i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();
    }

    public static void main(String args[]) {
        Integer nums[] = { 2, 4, 3, 17, 6, 5 };
        Arrays.sort(nums,Collections.reverseOrder());
        inbuiltSort(nums);
    }

}
