import java.util.*;

public class MaxElement {
    public static void main(String args[]) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);
        int maxElement = Integer.MIN_VALUE;
        for (int i = 0; i < numbers.size(); i++) {
            if (maxElement < numbers.get(i)) {
                maxElement = numbers.get(i);
            }
        }
        System.out.println(maxElement);
    }

}
