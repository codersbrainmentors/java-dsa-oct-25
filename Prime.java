public class Prime {
    public static void main(String[] args) {
        int num = 17;
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                System.out.println("Not Prime Number");
                return; // exit from the function
            }
        }
        System.out.println("Prime Number");
    }
}
