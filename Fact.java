public class Fact {
    public static void main(String[] args) {
        int num = 5;
        // 5! = 5 * 4 * 3 * 2 * 1
        // O(num) O(N)
        int fact = 1;
        for (int i = 1; i <= num; i++) {
            fact = fact * i;
        }
        System.out.println(fact);
    }
}
