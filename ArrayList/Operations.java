import java.util.ArrayList;;

public class Operations {
    public static void main(String args[]) {
        ArrayList<Integer> numbers = new ArrayList<>();
        // Add Element
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);

        // numbers.add(0, 5);
        // System.out.println(numbers);
        // Get Element
        // System.out.println(numbers.get(2));

        // Remove Element
        // numbers.remove(2);
        // System.out.println(numbers);

        // Set Element
        // numbers.set(2,50);
        // System.out.println(numbers);

        // Contains Element
        // System.out.println(numbers.contains(40));

        // Size()

        for (int i = 0; i < numbers.size(); i++) {
            System.out.print(numbers.get(i) + " ");
        }
    }

}
