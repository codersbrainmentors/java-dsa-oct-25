public class StringPr {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        Runtime r = Runtime.getRuntime();
        System.out.println(
                "Total " + r.totalMemory() + " Free " + r.freeMemory() + " Used " + (r.totalMemory() - r.freeMemory()));
        for (int i = 1; i <= 100000; i++) {
            System.out.println("Hello " + i);
            // String e = "Hello";
            // String e = new String("Hello" + i);
        }
        System.out.println(
                "Total " + r.totalMemory() + " Free " + r.freeMemory() + " Used " + (r.totalMemory() - r.freeMemory()));
        long endTime = System.currentTimeMillis();
        System.out.println(endTime - startTime);
    }
}
