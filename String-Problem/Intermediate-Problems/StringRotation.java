public class StringRotation {
    public static boolean isRotation(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
        String combined = str1 + str1;
        return combined.contains(str2);
    }

    public static void main(String args[]) {
        String str1 = "abcde";
        String str2 = "cdeab";

        System.out.println(isRotation(str1, str2));
    }
}
