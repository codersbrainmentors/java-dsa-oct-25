public class SolidSquare {
    public static void main(String[] args) {
        int n = 5;
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n; col++) {

                // Decision
                // Right Angle Decision
                if (col <= n + 1 - row) {
                    System.out.print((char) ('A' + col - 1));
                }
                // if (col <= row) {
                // System.out.print("*");
                // }
                // Hollow Square Decision
                /*
                 * if (row == 1 || col == 1 || col == n || row == n) {
                 * System.out.print("*");
                 * } else {
                 * System.out.print(" ");
                 * }
                 */
                // Square Decision
                // if (true) {
                // System.out.print("*"); // print - same line print
                // }
            } // col ends
              // move to the next row
            System.out.println(); // new line add
        }
    }
}
