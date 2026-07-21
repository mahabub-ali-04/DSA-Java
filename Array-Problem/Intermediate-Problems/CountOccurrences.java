public class CountOccurrences {
    public static int countOccurrencesElement(int arr[], int key) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                count++;
            }
        }
        return count;
    }

    public static void main(String args[]) {
        int arr[] = { 10, 20, 10, 30, 10 };
        int key = 10;
        System.out.println(countOccurrencesElement(arr, key));
    }

}
