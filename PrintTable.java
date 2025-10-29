public class PrintTable {

    static void printTable(int num, int end) {
        // base case
        if (end == 0) {
            return;
        }
        printTable(num, end - 1);
        System.out.println(num + "X" + end + "=" + (num * end));

    }

    public static void main(String[] args) {
        printTable(5, 10);
    }
}
