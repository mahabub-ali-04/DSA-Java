public class MostFrequentCharacter {

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

    public static char mostFrequentCharacter(String str) {
        int maxFrequency = 0;
        char mostFrequent = ' ';
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int frequency = countCharacterFrequency(str, ch);

            if (frequency > maxFrequency) {
                maxFrequency = frequency;
                mostFrequent = ch;
            }
        }
        return mostFrequent;
    }

    public static void main(String args[]) {
        String str = "banana";
        System.out.println(mostFrequentCharacter(str));
    }

}
