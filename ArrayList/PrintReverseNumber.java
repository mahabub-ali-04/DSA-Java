import java.util.ArrayList;

public class PrintReverseNumber {
    public static void main(String args[]) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);

        for (int i = numbers.size() - 1; i >= 0; i--) {
            System.out.print(numbers.get(i) + " ");
        }
        System.out.println();
    }

}
