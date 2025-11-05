public class MultiBranch {

    static void show(int x) {
        if (x <= 0) {
            return;
        }
        // System.out.println(x);
        show(x - 1);
        show(x - 2);

    }

    public static void main(String[] args) {
        show(50);
        System.out.println("Code Ends");
    }
}
