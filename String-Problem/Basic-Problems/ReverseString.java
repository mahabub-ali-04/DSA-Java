public class ReverseString {
    public static String reverseString(String str) {
        String newStr = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            newStr += str.charAt(i);
        }
        return newStr;
    }
    // public static void reverseString(String str) {
    // StringBuilder sb = new StringBuilder(str);
    // System.out.println(sb.reverse());
    // }

    public static void main(String args[]) {
        String str = "java";
        System.out.println(reverseString(str));
    }
}
