public class StringCompression {
    public static String compressString(String str) {
        StringBuilder sb = new StringBuilder();
        int count = 1;
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == str.charAt(i - 1)) {
                count++;
            } else {
                sb.append(str.charAt(i - 1));
                sb.append(count);
                count = 1;
            }
        }
        sb.append(str.charAt(str.length() - 1));
        sb.append(count);
        return sb.toString();
    }

    public static void main(String args[]) {
        String str = "aaabbc";
        System.out.println(compressString(str));
    }

}
