
public class Kadanes {
    public static void maxSubarraySum(int arr[]) {
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            // calculate sum
            currSum += arr[i];
            maxSum = Math.max(maxSum, currSum);
            if (currSum < 0) {
                currSum = 0;
            }

        }
        System.out.println("max subarray sum is: " + maxSum);
    }

    public static void main(String args[]) {
        int arr[] = { -2, -3, 4, -1, -2, 1, 5, -3 };
        maxSubarraySum(arr);
    }

}
