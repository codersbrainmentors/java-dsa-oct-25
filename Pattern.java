public class Pattern {
    public static void main(String[] args) {
        // for (int i = 1; i <= 5; i++) {
        // System.out.print("*".repeat(i));
        // System.out.println();
        // }
        int n = 5;
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n * 2 - 1; col++) {
                // Decision
                if (col >= n - row + 1 && col <= n + row - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
