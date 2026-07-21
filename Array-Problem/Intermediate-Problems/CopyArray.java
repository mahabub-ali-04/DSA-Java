public class CopyArray {
    public static int[] copyArray(int arr[]) {
        int copy[] = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            copy[i] = arr[i];
        }
        return copy;
    }

    public static void main(String args[]) {
        int arr[] = { 10, 20, 30, 40, 50 };
        int copiedArray[] = copyArray(arr);
        for (int i = 0; i < copiedArray.length; i++) {
            System.out.print(copiedArray[i] + " ");
        }
    }

}
