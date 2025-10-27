public class Loop {
    public static void main(String[] args) {
        int t1 = (int) 10.0 / 2;
        int arr[] = { 10, 20, 30, 40, 50 };
        // for (int i = 0; i < arr.length; i++) {
        // System.out.println(arr[i]);
        // }
        for (int i : arr) {
            System.out.println(i);
        }
        // for (int i = 1; i <= 10; i++) {
        // // Logic - Repeat
        // System.out.println("Amit");
        // }
        // int i = 1;
        // while (i <= 10) {
        // System.out.println("Amit " + i);
        // if (i % 2 == 0) {
        // i++;
        // } else {
        // i = i + 2;
        // }
        // }
        int i = 12;
        do {
            System.out.println("Amit " + i);
            i++;
        } while (i <= 10);
    }
}
