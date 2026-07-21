public class PrefixSum {
    public static int[] prefixSum(int arr[]) {
        if (arr.length == 0) {
            return new int[0];
        }
        int prefix[] = new int[arr.length];
        prefix[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            prefix[i] = prefix[i - 1] + arr[i];
        }
        return prefix;
    }

    public static int rangeSum(int prefix[], int left, int right) {
        if (left == 0) {
            return prefix[right];
        }
        return prefix[right] - prefix[left - 1];
    }

    public static void main(String args[]) {
        int arr[] = { 1, 2, 3, 4, 5, 6 };
        int prefix[] = prefixSum(arr);
        System.out.println(rangeSum(prefix, 1, 3));
    }

}
