public class Even {
    static void getEven(int n) {
        // Base case
        if (n == 0) {
            return;
        }

        if (n % 2 != 0) {
            System.out.println("Odd Number " + n);
        }
        // Pre Logic
        getEven(n - 1);
        // Post Logic
        if (n % 2 == 0) {
            System.out.println("Even Number " + n);
        }
    }

    public static void main(String[] args) {
        // call
        getEven(50);
    }
}
