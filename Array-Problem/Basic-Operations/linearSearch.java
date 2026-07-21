public class linearSearch {

    public static int linearSearch(int arr[], int key) {
        for (int i = 0; i < arr.length; i++) {
            if (key == arr[i]) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String args[]) {
        int arr[] = { 1, 2, 4, 5, 3, 9, 6, 8, 7 };
        int key = 1;
        System.out.println(linearSearch(arr, key));
    }

}
