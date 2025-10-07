/**
 * <p>
 * This is my class i build for learning and fun
 * 
 * @since 1 Oct 2025
 * @version 1.0
 * @author Amit
 * @code String
 */

public class StringDemo {
    /**
     * this is my show function
     */
    public void show() {

    }

    public static void main(String[] args) {
        // String Literal
        String a = "Amit"; // String is a collection of chars e.g char[] --> byte []
        String b = "Amit".intern();
        System.out.println(a == b);
        System.out.println(a.equals(b)); // search (true , false)
        System.out.println(a.equalsIgnoreCase(b));
        System.out.println(a.compareTo(b)); // sorting. -ve +ve 0
        String c = new String("Amit");
        String d = new String("amit");
        String e = new String("ram").intern();
        String f = "ram";

        /*
         * Multi Line Comment
         */
        // Single line comment
        // javadoc <fn>.java

    }
}
