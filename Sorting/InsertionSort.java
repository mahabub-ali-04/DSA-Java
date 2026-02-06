package Sorting;

public class InsertionSort {
    public static void insertionSort(int numbers[]) {
        for (int i = 1; i < numbers.length; i++) {
            int curr = numbers[i];
            int prev = i - 1;


            //finding out the correct position to insert
            while (prev >= 0 && numbers[prev] > curr) {
                numbers[prev + 1] = numbers[prev];
                prev--;
            }
            //insertion
            numbers[prev + 1] = curr;
        }
    }

    public static void printNum(int numbers[]) {
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();

    }

    public static void main(String args[]) {
        int numbers[] = { 1, 5, 4, 7, 6, 2 };
        insertionSort(numbers);
        printNum(numbers);
    }

}
