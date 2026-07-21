
public class CountPositiveNegative {
    public static void countPositiveNegative(int number[]) {
        int positiveCount = 0;
        int negativeCount = 0;
        for (int i = 0; i < number.length; i++) {
            if (number[i] < 0) {
                negativeCount++;
            } else if (number[i] > 0) {
                positiveCount++;
            }
        }
        System.out.println("Total positive count :" + positiveCount);
        System.out.println("Total negative count :" + negativeCount);
    }

    public static void main(String args[]) {
        int number[] = { -1, -2, 3, -4, 5, 6, 0, -9 };
        countPositiveNegative(number);
    }
}
