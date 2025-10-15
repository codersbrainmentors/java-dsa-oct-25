public class Loops {
    public static void main(String[] args) {
        int num = 12345;
        int sum = 0;
        while (num != 0) {
            // Step - 1 get the last digit
            int lastDigit = num % 10;
            // Step - 2 make the sum
            sum = sum + lastDigit;
            // Step - 3 make the digit small
            num = num / 10;
        }
        System.out.println(sum);
    }
}
