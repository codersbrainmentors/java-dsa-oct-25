public class FactDemo {
    static void fact(int num, int result) {
        // base case
        if (num == 0) {
            System.out.println("Factorial is " + result);
            return;
        }
        // Your Logic
        // Small Problem
        // num = num - 1 or num - 1
        fact(num - 1, result * num);

    }

    public static void main(String[] args) {
        fact(5, 1);

    }
}
