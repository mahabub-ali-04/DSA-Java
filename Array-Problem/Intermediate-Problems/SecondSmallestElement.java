public class SecondSmallestElement {
    public static int secondSmallest(int[] arr) {
        if (arr.length < 2) {
            throw new IllegalArgumentException("Array must contain at least two elements.");
        }
        int smallest = arr[0];
        int secondSmallest = Integer.MAX_VALUE;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < smallest) {
                secondSmallest = smallest;
                smallest = arr[i];
            } else if (arr[i] < secondSmallest && arr[i] > smallest) {
                secondSmallest = arr[i];
            }
        }
        return secondSmallest;

    }

    public static void main(String args[]) {
        int arr[] = { 20, 10, 30, 90, 60, 40 };
        System.out.println(secondSmallest(arr));
    }
}
