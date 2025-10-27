public class GCD {
    public static void main(String[] args) {
        int n1 = 12;
        int n2 = 18;
        int gcd = 0;
        for (int i = 1; i <= Math.min(n1, n2); i++) {
            if (n1 % i == 0 && n2 % i == 0) {
                gcd = i;
                // int pp = 10; // Block Scope
                // break;
            }
        }
        System.out.println(gcd);
    }
}
