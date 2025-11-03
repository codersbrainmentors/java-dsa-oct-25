public class PrintTable2 {
    static String printTable(int num, int n) {
        if (n == 0) {
            return "";
        }
        String temp = printTable(num, n - 1); // Head
        String expression = num + " X " + n + " = " + (num * n) + "\n";
        return temp + expression;
    }

    // static int countZeros(int num) {

    // }

    static void decimalToBinary(int num, String result) {
        if (num == 0) {
            System.out.println(result);
            return;
        }

        decimalToBinary(num / 2, num % 2 + result); // Tail
        // System.out.print(num % 2); // R
    }

    // static void binaryToDecimal(int num){

    // }

    // static int[] countEvenOddDigitsInANumber(int num){

    // }

    public static void main(String[] args) {
        // decimalToBinary(11, "");
        String result = printTable(5, 10);
        System.out.println(result);

        // int c = countZeros(908004);
        // System.out.println(c);
    }
}
