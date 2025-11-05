public class StringReverse {
    // str[0]= 'A';
    static String reverse(String str) {
        // stop the recursion - base case
        if (str.length() == 0) {
            return "";
        }
        String smallAns = reverse(str.substring(1));
        return smallAns + str.charAt(0);
    }

    public static void main(String[] args) {
        String name = "Amit"; // tima
        System.out.println(reverse(name));
    }

}
