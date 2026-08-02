import java.util.ArrayList;
import java.util.Collections;

public class Sorting {
    public static void main(String args[]) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(20);
        numbers.add(10);
        numbers.add(40);
        numbers.add(30);
        numbers.add(50);
        System.out.println(numbers);

        // Ascending Order
        Collections.sort(numbers);
        System.out.println(numbers);

        // Descending Order
        Collections.sort(numbers, Collections.reverseOrder());
        System.out.println(numbers);
    }

}
