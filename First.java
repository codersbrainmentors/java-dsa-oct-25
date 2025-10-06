// Java - OOPS

import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintStream;

class First {

    static public void main(int x) {
        System.out.println("Another int main...");
    }

    // main (method) overloading
    // user define main
    static public void main() {
        System.out.println("Another Main ...");
    }

    int b;

    // jvm understand this signature
    static public void main(String args[]) {
        // c:\\abcd
        String path = "/Users/amitsrivastava/Documents/codes-2to5/output.txt";
        try {
            System.setOut(new PrintStream(new FileOutputStream(path, true)));
        } catch (Exception e) {
            System.out.println(e);
        }
        main();
        main(10);
        final int n = 10;
        final int MAX = 100;
        // MAX++;
        int a = 10; // Explicit Way
        var b = 20; // Implicit Way, Type Inference Java 11
        // b = "Amit";
        // b = 90.20;
        System.out.println("Hello Java");
        // System.in
        // System.err

        // System - in , out , err
    }
}