public class CharacterFrequency {
    public static int countCharacterFrequency(String str, char ch) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            char currChar = str.charAt(i);
            if (ch == currChar) {
                count++;
            }
        }
        return count;
    }

    public static void characterFrequency(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            // check if character is already processed
            if (sb.indexOf(String.valueOf(ch)) == -1) {
                int frequency = countCharacterFrequency(str, ch);
                System.out.print(ch + ": " + frequency);
                // add character to processed character
                sb.append(ch);
                System.out.println();
            }
        }
    }

    public static void main(String args[]) {
        String str = "banana";
        characterFrequency(str);
    }

}
