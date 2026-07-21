public class SecondLargestElement {
    public static int secondLargest(int[] arr) {
        if (arr.length < 2) {
            throw new IllegalArgumentException("Array must contain at least two elements.");
        }
        int largest = arr[0];
        int secondLargest = Integer.MIN_VALUE;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];
            } else if (arr[i] > secondLargest && arr[i] < largest) {
                secondLargest = arr[i];
            }
        }
        return secondLargest;

    }

    public static void main(String args[]) {
        int arr[] = { 20, 30, 10, 60, 40, 90 };
        System.out.println(secondLargest(arr));
    }

}
