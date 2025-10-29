public class Recursion {
    // camelCase
    static void printMyName(int count) {
        // base case or termination case
        if (count == 0) {
            // stop the recursion
            return; // exit from the function
        }
        System.out.println("Amit " + count);
        // Pre Logic - Stack Build Wale time ka Logic
        printMyName(count - 1); // repeat
        System.out.println("Srivastava " + count);
        // Stack Fall Hote Time ka Logic
        // when i return i will be here in this line - BackTrack
        // Logic
        // small problem
        // 100 - 99
    } // end - exit

    public static void main(String[] args) {
        // Repeat
        printMyName(5);
    }
}
