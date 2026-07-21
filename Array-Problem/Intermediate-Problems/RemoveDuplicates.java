public class RemoveDuplicates {
    public static int removeDuplicates(int[] arr) {
        if (arr.length == 0) {
            return 0;
        }
        int slow = 0;
        for (int fast = 1; fast < arr.length; fast++) {
            if (arr[slow] != arr[fast]) {
                slow++;
                arr[slow] = arr[fast];
            }
        }
        return slow + 1;
    }

    public static void printArr(int arr[]) {
        int length = removeDuplicates(arr);
        for (int i = 0; i < length; i++) {
            System.out.print(arr[i] + " ");
        }

    }

    public static void main(String args[]) {
        int arr[] = { 1, 1, 2, 2, 3 };
        printArr(arr);
    }

}
