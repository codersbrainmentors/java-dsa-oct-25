
public class Reverse {
    public static void main(String[] args) {
        // long num = 12345678887L;
        // BigInteger b = new
        // BigInteger("4796745896745986754986798457689457698745986798546798");
        // int num = 12345;
        int reverse = 0;
        for (int num = 12345; num > 0; num = num / 10) {
            int lastDigit = num % 10;
            reverse = reverse * 10 + lastDigit;
        }
        System.out.println(reverse);
        // while (num > 0) {

        // // 1. get the last digit
        // int lastDigit = num % 10;
        // // 2. change place and store it
        // reverse = reverse * 10 + lastDigit;
        // // shrink
        // num = num / 10;
        // }

    }
}
