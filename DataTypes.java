import java.util.LinkedList; // Manual
import java.lang.*; // Auto Import

public class DataTypes {
    public static void main(String[] args) {

        System.out.println("पहला नंबर दर्ज करें");
        // primitive == Wrapper
        // int == Integer
        // float == Float
        // double == Double
        // Java DS - Wrapper / Objects
        LinkedList<Integer> l = new LinkedList<>();
        // Boxing + UnBoxing = Auto Boxing
        int p = 10000; // primitive
        Integer p2 = Integer.valueOf(p); // Boxing value type convert into reference type // primitive to reference
                                         // conversion
        Integer p3 = p; // AutoBoxing
        int p4 = p3;
        int p5 = p3.intValue(); // UnBoxing
        Integer x1 = 1000;
        System.out.println(x1.byteValue());
        System.out.println(x1.floatValue());
        // static method - classname.methodname
        // static - when class load that time static things also load
        // static - comes eager
        int b = Integer.parseInt("1001", 2);

        System.out.println(b);
        // number - non decimal + decimal
        // non - decimal
        byte x = 10; // 1 byte
        // 8 bit , 1 bit + - , 7 bit
        // 2 ^ 7 to 2^ 7 -1
        // -128 to 127
        short y = 20; // 2 byte
        int z = 10000; // 4 byte
        long h = 54354356l; // 8 byte

        // decimal
        float r = 100.20F; // 4 byte
        double g = 999.222; // 8 byte

        // char - 2 byte - UNICODE chars
        char agree = 'न';
        System.out.println(agree);

        boolean att = true; // 1 , 2 , 4
        byte r2 = (byte) 129;
        System.out.println(r2);
        byte h1 = 100;
        byte h2 = 20;
        byte h3 = (byte) (h1 + h2);
        h2 += h1; // arithmetic assignment operator
        // byte h3 = h1 - h2;

    }
}
