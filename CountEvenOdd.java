public class CountEvenOdd {

    static void countEvenOdd(int num, int evenCount, int oddCount) {
        // base case
        if (num == 0) {
            System.out.println("Even Count " + evenCount);
            System.out.println("Odd Count " + oddCount);
            return; // exit from the function call
        }
        // Logic Here
        // small problem
        if (num % 2 == 0) {
            evenCount++; // evenCount = eventCount + 1
        } else {
            oddCount++;
        }
        countEvenOdd(num - 1, evenCount, oddCount);
    }

    public static void main(String[] args) {
        countEvenOdd(100, 0, 0);
    }
}
