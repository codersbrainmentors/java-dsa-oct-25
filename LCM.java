public class LCM {
    // main() -- Call Stack = Fn + Local Variable
    // Function Local Variable - Scope through out the function
    // Block Scope -
    public static void main(String[] args) {
        int n1 = 4;
        int n2 = 6;
        int lcm = 0;
        for (int i = 1; i <= (n1 * n2); i++) {
            if (i % n1 == 0 && i % n2 == 0) {
                lcm = i;
                // int pp = 10; // Block Scope
                break;
            }
        }
        System.out.println(lcm);
    }
}
