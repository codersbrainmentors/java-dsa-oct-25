public class PowerOfNUmber {
    public static void main(String[] args) {
        int n = 3;
        int pow = 5;
        int r = 1;
        for (int i = 1; i <= pow; i++) {
            r = r * n;
        }
        System.out.println(r);
    }
}
