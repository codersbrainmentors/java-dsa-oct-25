public class Calc {
    // function/ method define
    static int add(int a, int b) {
        int c = a + b;
        return c;
    } // end

    static int subtract(int x, int y) {
        return x - y;
    }

    static void mul(int x, int y) {
        int z = x * y;
        System.out.println(z);
    }

    static void divide() {
        int p = 100;
        int q = 2;
        System.out.println(p / q);
    }

    public static void main(String[] args) {
        // call this function / method
        int d = add(10, 20); // when u call a function it goes in a stack
        System.out.println(d);
        d = subtract(100, 200);
        divide();
        System.out.println(d);
    }
}
