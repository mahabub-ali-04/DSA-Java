public class RotateArray {
    public static void leftRotateByOne(int[] arr) {

        int temp = arr[0];
        for (int i = 0; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }
        arr[arr.length - 1] = temp;
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String args[]) {
        int arr[] = { 2, 3, 4, 9, 8, 7 };
        leftRotateByOne(arr);
    }

}
