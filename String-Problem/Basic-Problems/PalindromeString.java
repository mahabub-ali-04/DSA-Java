public class PalindromeString {
    public static boolean isPalindrome(String str) {
        String newStr = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            newStr += str.charAt(i);
        }
        if (newStr.equals(str)) {
            return true;
        }
        return false;
    }

    public static void main(String args[]) {
        String str = "racecar";
        System.out.println(isPalindrome(str));
    }
}
