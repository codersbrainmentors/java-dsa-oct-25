public class RecWithArray {

    static void printPrices(int prices[], int index) {
        // base case
        if (prices.length == index) {
            return;
        }
        System.out.println(prices[index]);
        printPrices(prices, index + 1);
    }

    static int[] doubleThePrices(int prices[], int index) {

        // Write Your Logic Here
        // base case
        if (prices.length == index) {
            int doublePriceArr[] = new int[prices.length];
            return doublePriceArr; // all fill with zero
        }
        int doublePriceArr[] = doubleThePrices(prices, index + 1);
        doublePriceArr[index] = prices[index] * 2;
        return doublePriceArr;

    }

    public static void main(String[] args) {
        // int price = 200;
        int prices[] = { 90, 100, 88, 77, 55 };
        int doublePr[] = doubleThePrices(prices, 0);
        System.out.println("Prices get Double....");
        for (int i : doublePr) {
            System.out.println(i);
        }
        // printPrices(prices, 0);
        // int matrix[][] = {{10,20,30}, {90,100,200}, {888,666,444}};
    }
}
