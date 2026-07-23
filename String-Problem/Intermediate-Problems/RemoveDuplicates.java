public class RemoveDuplicates {
    public static String removeDuplicates(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (sb.indexOf(String.valueOf(ch)) == -1) {
                sb.append(ch);
            }
        }
        return sb.toString();
    }

    public static void main(String args[]) {
        String str = "programming";
        System.out.println(removeDuplicates(str));
    }

}
