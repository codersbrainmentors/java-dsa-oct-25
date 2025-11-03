public class Fact2 {

    static int fact(int num) {
        // base case
        if (num == 1) {
            return num;
        }
        // n! = n * n-1
        return num * fact(num - 1);
    }

    static void fact(int num, int result) {
        // base case
        if (num == 1) {
            System.out.println(result);
            return;
        }
        // n! = n * n-1
        fact(num - 1, result * num);
    }

    public static void main(String[] args) {
        fact(5, 1);
        // 5! = 5 * 4
        // 4 * 3
        // n! = n * n-1 - RR
    }
}
