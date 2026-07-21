public class KadanesAlgorithm {
    public static int kadanesAlgorithm(int arr[]) {
        if (arr.length == 0) {
            throw new IllegalArgumentException("array can't be empty");
        }
        int currentSum = 0;
        int maxSum = arr[0];
        for (int i = 0; i < arr.length; i++) {
            currentSum += arr[i];
            maxSum = Math.max(maxSum, currentSum);
            if (currentSum < 0) {
                currentSum = 0;
            }
        }
        return maxSum;
    }

    public static void main(String args[]) {
        int arr[] = { -2, -1, 3, 4, };
        System.out.println((kadanesAlgorithm(arr)));
    }

}
