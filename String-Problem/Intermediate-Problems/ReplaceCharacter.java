public class ReplaceCharacter {
    public static String replaceCharacter(String str, char oldChar, char newChar) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == oldChar) {
                sb.append(newChar);
            } else {
                sb.append(ch);
            }
        }
        return sb.toString();
    }

    public static void main(String args[]) {
        String str = "banana";
        char oldChar = 'a';
        char newChar = 'o';
        System.out.println(replaceCharacter(str, oldChar, newChar));

    }

}
