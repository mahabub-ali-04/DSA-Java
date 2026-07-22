public class CountCharacterFrequency {
    public static int countCharacterFrequency(String str, char target) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == target) {
                count++;
            }
        }
        return count;
    }

    public static void main(String args[]) {
        String str = "programming";
        char target = 'p';
        System.out.println(countCharacterFrequency(str, target));
    }
}
