public class LargestSmallest {
    public static void largestSmallestElement(int arr[]) {
        int largest = arr[0];
        int smallest = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (largest < arr[i]) {
                largest = arr[i];
            }
            if (smallest > arr[i]) {
                smallest = arr[i];
            }
        }
        System.out.println("Largest element :" + largest);
        System.out.println("Smallest element :" + smallest);
    }

    public static void main(String args[]) {
        int arr[] = { 2, 4, 3, 5, 6, 1, 8 };
        largestSmallestElement(arr);
    }

}
