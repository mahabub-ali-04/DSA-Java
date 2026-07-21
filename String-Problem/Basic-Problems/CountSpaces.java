public class CountSpaces {
    public static int countSpaces(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                count++;
            }
        }
        return count;
    }

    public static void main(String args[]) {
        String str = "I love coding! Happy Coding";
        System.out.println(countSpaces(str));
    }
}
