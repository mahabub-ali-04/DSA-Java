public class Average {
    public static float average(int arr[]) {
        int sum = 0;
        float avg;
        int length = arr.length;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        avg = sum / length;
        return avg;

    }
    public static void main(String args[]) {
        int arr[] = { 2, 3, 4, 1, 6 };
        System.out.println(average(arr));
    }

}
