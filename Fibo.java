public class Fibo {
    public static void main(String[] args) {
        int range = 10;
        int first = 0;
        int second = 1;
        for (int i = 1; i <= range; i++) {
            int third = first + second;
            System.out.println(first);
            first = second;
            second = third;

        }
    }
}
