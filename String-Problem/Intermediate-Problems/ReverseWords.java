public class ReverseWords {
    public static String reverseWords(String str) {
        String words[] = str.split(" ");
        StringBuilder sb = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            sb.append(words[i]);

            if (i != 0) {
                sb.append(" ");
            }
        }
        return sb.toString();
    }

    public static void main(String args[]) {
        String str = "I Love Java";
        System.out.println(reverseWords(str));
    }

}
