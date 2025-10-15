public class PrimeNumber {
    public static void main(String[] args) {
        var num = 17;
        // Approach - 1
        // int factor = 0;
        // TC O(num) O(n)
        // for (int i = 1; i <= num; i++) {
        // if (num % i == 0) {
        // factor++;
        // }
        // }
        // if (factor == 2) {
        // System.out.println("Prime Number");
        // } else {
        // System.out.println("Not Prime Number");
        // }
        // Approach - 2 Sqrt based
        // O(Sqrt of num) O(Sqrt N)
        // for (int i = 2; i * i <= num; i++) {
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                System.out.println("Not Prime Number");
                return; // exit from the function
            }
        }
        System.out.println("Prime Number");
    }
}
