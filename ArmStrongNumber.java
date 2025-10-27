public class ArmStrongNumber {
    public static void main(String[] args) {
        int num = 1535;
        int dup = num;
        int count = 0;
        // Count Digits
        while (num != 0) {
            count++;
            // make number small
            num = num / 10;
        }
        num = dup;
        int sum = 0;
        while (num != 0) {
            // get the last digit
            int lastDigit = num % 10;
            // get the power and do the sum
            sum = sum + (int) Math.pow(lastDigit, count);
            // make the number small
            num = num / 10;
        }
        System.out.println(sum == dup ? "Armstrong Number " : "Not Armstrong number");
        // System.out.println("Digits " + count);
        // Based on Digits do Power
        // Do Sum
        // Org == Sum ArmStrong

    }
}
