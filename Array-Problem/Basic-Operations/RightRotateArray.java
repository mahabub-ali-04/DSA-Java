public class RightRotateArray {
    public static void rightRotateByOne(int[] arr) {
        int temp = arr[arr.length - 1];
        for (int i = arr.length - 1; i > 0; i--) {
            arr[i] = arr[i-1];
        }
        arr[0] = temp;

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String args[]) {
        int arr[] = { 2, 3, 4, 9, 8, 7 };
        rightRotateByOne(arr);
    }

}
