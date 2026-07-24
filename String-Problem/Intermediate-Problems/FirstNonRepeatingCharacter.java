public class FirstNonRepeatingCharacter {
    public static int countCharacterFrequency(String str, char ch) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            char currChar = str.charAt(i);
            if (currChar == ch) {
                count++;
            }
        }
        return count;
    }

    public static String firstNonRepeatingCharacter(String str) {
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int frequency = countCharacterFrequency(str, ch);
            if (frequency == 1) {
                return String.valueOf(ch);
            }
        }
        return "No Unique Element Found";
    }

    public static void main(String args[]) {
        String str = "aabbcdd";
        System.out.println(firstNonRepeatingCharacter(str));
    }
}
