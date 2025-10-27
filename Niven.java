public class Niven {
    public static void main(String[] args) {
        int num = 23;
        int dup = num;
        int sum = 0;
        // sum of the digit
        // 1 + 8 = 9
        while (num != 0) {
            int lastDigit = num % 10;
            sum = sum + lastDigit;
            num = num / 10;
        }
        System.out.println(dup % sum == 0 ? "Niven Number" : "NOt ");

    }
}
