public class SwitchCaseDemo {
    public static void main(String[] args) {
        float pp = 90.20f;
        StringBuilder sb = new StringBuilder();
        synchronized (sb) {
            sb.append("gjdfkhgk");
        }
        sb.append("ghdfjkgfd");
        System.out.println("Amit".length());
        int day = 10;
        // String day = "Sunday";
        // System.out.println(day.hashCode());
        switch (day) {
            default:
                System.out.println("Invalid Day");

            case 1:
                System.out.println("Working Day");
                break;
            case 2:
                System.out.println("Another Working Day");
                break;

        }
    }
}
