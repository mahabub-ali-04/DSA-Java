public class MergeArrays {
    public static int[] mergeArrays(int arr1[], int arr2[]) {
        int merge[] = new int[arr1.length + arr2.length];
        // first loop for arr1
        for (int i = 0; i < arr1.length; i++) {
            merge[i] = arr1[i];
        }
        // 2nd loop for arr2
        for (int i = 0; i < arr2.length; i++) {
            merge[arr1.length + i] = arr2[i];
        }
        return merge;
    }

    public static void main(String args[]) {
        int arr1[] = { 10, 20, 30 };
        int arr2[] = { 40, 50, 60 };
        int mergedArray[] = mergeArrays(arr1, arr2);
        for (int i = 0; i < mergedArray.length; i++) {
            System.out.print(mergedArray[i] + " ");
        }
        System.out.println();
    }

}
