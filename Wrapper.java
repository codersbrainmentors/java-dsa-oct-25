import java.math.BigDecimal;
import java.math.BigInteger;

public class Wrapper {
    public static void main(String[] args) {
        BigDecimal bb = new BigDecimal("4645654654654.545345435345");
        BigInteger b = new BigInteger("6456575676587678456485684657864563487564378543657534");
        BigInteger b2 = new BigInteger("6456575676587678456485684657864563487564378543657534");
        BigInteger b3 = b.add(b2);
        System.err.println(b3);
        char x = 'A';
        Character y = 'A';
        System.out.println(y.charValue());
        System.out.println();
        System.out.println(Character.isAlphabetic(x));
    }
}
