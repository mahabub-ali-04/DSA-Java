public class CountDigits {
    public static int countDigits(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= '0' && ch <= '9') {
                count++;
            }
        }
        return count;
    }

    public static void main(String args[]) {
        String str = "arbaj123hey234";
        System.out.println((countDigits(str)));
    }

}
