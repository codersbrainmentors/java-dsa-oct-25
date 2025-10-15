import java.util.Scanner;

public class PrintDigit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = scanner.nextInt(); // n size digit
        // int num = 12345;
        int copy = num;
        int count = 0;
        // count the digit, TC O(N)
        while (num != 0) { // till number become 0
            num = num / 10; // make the number small
            count++; // count it
        }
        // System.out.println(count);
        num = copy;
        int pow = (int) Math.pow(10, count - 1); // 10 ^ 4
        // O(N)

        while (num != 0) {

            int firstDigit = num / pow;
            System.out.println(firstDigit);
            // remove the first digit
            num = num % pow;
            pow = pow / 10;
        }
        // TC - O(N)
        // SC - O(1)
        scanner.close(); // buffer close
    }
}
