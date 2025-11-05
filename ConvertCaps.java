public class ConvertCaps {

    static String toggleCaps(String str) {

        // Base case
        if (str.length() == 0) {
            return "";
        }
        String smallAns = toggleCaps(str.substring(1));
        char firstChar = str.charAt(0);
        if (firstChar >= 'A' && firstChar <= 'Z') { // Capital Case
            firstChar = (char) (firstChar + 32);
            // String.valueOf(firstChar).toLowerCase();
        } else {
            firstChar = (char) (firstChar - 32);
        }
        return firstChar + smallAns;

    }

    public static void main(String[] args) {
        String a = "AbCdEf";
        String r = toggleCaps(a);
        System.out.println(r);
    }
}
