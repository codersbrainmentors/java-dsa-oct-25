public class SwitchCaseDemo {
    static int getPrice(String item) {
        switch (item) {
            case "Burger":
                return 100;
            case "Drinks":
                return 50;
            case "Desserts":
                return 100;
            default:
                return 0;
        }
    }

    public static void main(String[] args) {

        /*
         * Menu Driven, Choice Driven, Equal Comparsion,
         * When it compare from any case , then it do fall
         * Faster than if else? Because of Lookup table e.g Map - Key , Value
         * switch case support int , byte , char
         * from Java 7 Support String
         * old switch case not give the return value (NOt work as an expression)
         * : vs ->
         */

        final int BURGER = 1; // constant (ALL CAPS)
        // int choice = BURGER;
        String choice = "Pizza";
        final int DRINKS = 2;
        final int DESSERTS = 3;

        // HashMap - Key + Value
        switch (choice) {
            default:
                System.out.println("Wrong Choice....");
                // case BURGER: // choice == 1
            case "Burger":
                System.out.println(" Rs 100");
                break; // exit from the case (block)
            case "Drinks":
                // case DRINKS: // choice == 2
                System.out.println(" rs 50");
                break;
            case "Desserts":
                // case DESSERTS:
                System.out.println(" Rs 200");
                break;

        }

        // i want price data , then do some calc , then i want to print
        int a = 10 + 20 * 4; // math expression
        // Old Style
        int price = getPrice("Burger");
        double gst = price * 0.18;
        System.out.println("Total Amount is " + (price + gst));

        // Modern SwitchCase
        // Switch with Expression
        int price2 = switch (choice) {
            case "Burger", "Pizza" -> {
                // Multi Line expression
                // Logic
                int d = 100;
                int e = 200;
                int f = 300;
                yield d + e + f;
            }
            case "Drinks" -> 50;
            case "Desserts" -> 200;
            default -> 0;
        };
        System.out.println("Switch With Expression " + price2);

    }
}
