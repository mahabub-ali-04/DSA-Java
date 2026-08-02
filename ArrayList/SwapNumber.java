import java.util.ArrayList;

public class SwapNumber {
    public static void swapNumber(ArrayList<Integer> numbers, int idx1, int idx2) {
        int temp = numbers.get(idx1);
        numbers.set(idx1, numbers.get(idx2));
        numbers.set(idx2, temp);
    }

    public static void main(String args[]) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);
        int idx1 = 1;
        int idx2 = 3;
        System.out.println(numbers);
        swapNumber(numbers, idx1, idx2);
        System.out.println(numbers);
    }

}
