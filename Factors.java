public class Factors {
    public static void main(String[] args) {
        int num = 36;
        // O(num) O(N) O(36)
        // O(6)
        for (int i = 1; i * i <= num; i++) {
            if (num % i == 0) {
                System.out.println("Factors " + i);
            }
        }
    }
}
