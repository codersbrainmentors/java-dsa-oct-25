import java.util.HashMap;

public class Figlet {
    public static void main(String[] args) {
        HashMap<Character, String> map = new HashMap<>();
        String aPattern = """
                    **
                   *  *
                  ******
                 *      *
                *        *
                                """;

        String bPattern = """
                *******
                *     *
                *     *
                *******
                *     *
                *     *
                *******
                                """;
        // map fill
        map.put('a', aPattern);
        map.put('b', bPattern);
        String name = "BAABB";
        for (char c : name.toLowerCase().toCharArray()) {
            System.out.println(map.get(c) + " ");
        }
        System.out.println();
        // System.out.println(aPattern);
        ;
    }
}
