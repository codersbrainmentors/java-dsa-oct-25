import java.text.DateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.LinkedList;
import java.util.Locale;

public class TypeCasting {
    public static void main(String[] args) {
        Integer h = 1000;
        Integer h2 = 1000;
        Float bb = 10.20f;
        Float cc = 10.20f;
        System.out.println(bb == cc);
        System.out.println(h == h2);
        String n1 = "Amit";
        String n2 = "Amit";
        String n3 = new String("Amit");
        System.out.println(n1 == n2);
        System.out.println(n1 == n3);

        int arr[] = { 10, 20, 30, 40, 50, 900, 100, 88, 55 };
        Arrays.sort(arr);
        for (int i : arr) {
            System.out.println(i);
        }

        // Reference Type e.g class
        // Data + Methods
        String name = "Amit";
        System.out.println(name.toUpperCase());
        System.out.println(name.length());

        Date d = new Date();
        System.out.println(d);
        Locale locale = new Locale("ja", "jp");
        DateFormat df = DateFormat.getDateInstance(DateFormat.FULL, locale);
        System.out.println(df.format(d));
        int a = 10;
        byte b = (byte) a; // explicit typecasting
        System.out.println(b);
        int c = b; // implicit typecasting

        int k = 100;
        float k2 = k;
        System.out.println(k2);
        int k3 = (int) k2;
    }
}
