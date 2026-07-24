public class AnagramString {
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

    public static boolean isAnagram(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
        for (int i = 0; i < str1.length(); i++) {
            char ch = str1.charAt(i);
            int frequency1 = countCharacterFrequency(str1, ch);
            int frequency2 = countCharacterFrequency(str2, ch);
            if (frequency1 != frequency2) {
                return false;
            }
        }
        return true;
    }

    public static void main(String args[]) {
        String str1 = "listen";
        String str2 = "silent";
        System.out.println(isAnagram(str1, str2));
    }

}
