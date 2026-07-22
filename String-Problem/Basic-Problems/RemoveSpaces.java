public class RemoveSpaces {
    public static String removeSpaces(String str) {
        String newStr = "";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ' ') {
                newStr += str.charAt(i);
            }
        }
        return newStr;
    }

    public static void main(String args[]) {
        String str = "I love Java";
        System.out.println(removeSpaces(str));
    }
}
