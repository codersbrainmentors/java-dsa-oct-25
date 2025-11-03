public class CountEvenOdd2 {

    static int[] countEvenOdd(int range) {
        if (range == 0) {
            int arr[] = new int[2]; // {0,0}
            return arr;
        }
        int arr[] = countEvenOdd(range - 1);
        if (range % 2 == 0) {
            arr[0]++;
        } else {
            arr[1]++;
        }
        return arr;

    }

    public static void main(String[] args) {
        int arr[] = countEvenOdd(100);
        System.out.println("Total Even " + arr[0]);
        System.out.println("Total odd " + arr[1]);
    }
}
