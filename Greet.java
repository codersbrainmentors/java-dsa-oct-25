public class Greet {
    public static void main(String[] args) {
        // String output = """
        // _ __ _
        // | |/ /___ _ __ _ __ (_)_ __ __ _
        // | ' // _ \ '__| '_ \| | '_ \ / _` |
        // | . \ __/ | | | | | | | | | (_| |
        // |_|\_\___|_| |_| |_|_|_| |_|\__, |
        // |___/
        // """;
        // System.out.println(args[0] + " " + args[1] + " " + args[2]);
        int sum = 0;
        // String h = "1234";
        // char arr [] = h.toCharArray();
        for (int i = 0; i < args.length; i++) {
            sum = sum + Integer.parseInt(args[i]);
        }
        System.out.println(sum);
    }
}
