package Sorting;

public class SelectionSort {
    public static void selectionsort(int numbers[]) {
        for (int i = 0; i < numbers.length - 1; i++) { // passes n-1
            int minPos = i;
            for (int j = i + 1; j < numbers.length; j++) { //comparision 
                if (numbers[minPos] > numbers[j]) {
                    minPos = j;
                }
            }

            //Swap
            int temp = numbers[minPos];
            numbers[minPos] = numbers[i];
            numbers[i] = temp;
        }
    }

    public static void printNum(int numbers[]) {
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
    }

    public static void main(String args[]) {
        int numbers[] = { 1, 5, 3, 7, 6, 2 };
        selectionsort(numbers);
        printNum(numbers);
    }

}
