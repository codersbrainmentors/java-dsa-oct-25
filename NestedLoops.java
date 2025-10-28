public class NestedLoops {
    public static void main(String[] args) {
        // Labeled Loops
        // label:
        outer: for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 3; j++) {
                if (i == j) {
                    // break label;
                    // break outer;
                    continue outer;
                    // continue; // skip the current iteration
                    // break; // exit from the current loop
                }
                System.out.println(i + " " + j);
            }
        }
    }
}
