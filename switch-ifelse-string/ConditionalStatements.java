import java.util.Scanner;

public class ConditionalStatements {
    public static void main(String[] args) {
        // int a = 10;
        // int b = 20;
        // int c = 30;
        Scanner scanner = new Scanner(System.in); // bytes
        System.out.println("Enter the A ");
        int a = scanner.nextInt();
        System.out.println("Enter the B ");
        int b = scanner.nextInt();
        System.out.println("Enter the C");
        int c = scanner.nextInt();
        // nested if else
        if (a > b) {
            if (a > c) {
                System.out.println("A is greater");
            } else {
                System.out.println("C is Greater");
            }
        } else {
            if (b > c) {
                System.out.println("B is greater");
            } else {
                System.out.println("C is Greater");
            }
        }
        scanner.close();
        // Multiple if else
        if (a > b && a > c) {
            System.out.println("A is greater");
        } else if (b > a && b > c) {
            System.out.println("B is Greater");
        } else {
            System.out.println("C is Greater");
        }
    }
}
