public class MoveZerosToEnd {
    public static void moveZerosToEnd(int[] arr) {
        int slow = 0;
        for (int fast = 0; fast < arr.length; fast++) {
            if (arr[fast] != 0) {
                int temp = arr[slow];
                arr[slow] = arr[fast];
                arr[fast] = temp;
                slow++;
            }
        }
    }

    public static void main(String args[]) {
        int arr[] = { 0, 0, 1, 2, 0, 3, 0 };
        moveZerosToEnd(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }

}
