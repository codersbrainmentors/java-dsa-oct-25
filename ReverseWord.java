public class ReverseWord {
    static String reverse(String str) {
        char ch[] = str.toCharArray(); // string to char array convert
        int i = 0;
        int j = str.length() - 1;
        while (i <= j) {
            char temp = ch[i];
            ch[i] = ch[j];
            ch[j] = temp;
            i++;
            j--;
        }
        return new String(ch); // char array convert it into string
    }

    public static void main(String[] args) {
        String a = "SalesForce Example";
        String words[] = a.split(" ");
        StringBuilder sb = new StringBuilder();
        for (String word : words) {
            sb.append(reverse(word)).append(word.length()).append(" ");
        }
        // System.out.println(sb);
        String r = sb.toString().trim();
        System.out.println(r);

        // a[0] = "t";
    }
}
