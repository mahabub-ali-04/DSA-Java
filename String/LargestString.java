package String;

public class LargestString {
    public static String largestString(String fruits[]) {
        String largest = "";
        for (int i = 0; i < fruits.length; i++) {
            // Lexicography
            if (largest.compareTo(fruits[i]) < 0) {
                largest = fruits[i];
            }
        }
        return largest;
    }

    public static void main(String args[]) {
        String fruits[] = { "apple", "banana", "mango" };
        System.out.println(largestString(fruits));
    }

}
