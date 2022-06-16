package javase.chapter4;

import java.io.PrintStream;

public class RecapString {
    private static final PrintStream out = System.out;

    public static void main(String[] args) {
        method5();
    }

    private static void method5() {
        var x = "Hello World";
        var z = " Hello World".trim();
        System.out.println(x == z); // false

        var name = "Hello World";
        var name2 = new String("Hello World").intern();
        System.out.println(name == name2); // true
    }

    private static void method1() {
//        var start = "AniMaL   ";
//        var trimmed = start.trim();                // "AniMaL"
//        var lowercase = trimmed.toLowerCase();     // "animal"
//        var result = lowercase.replace('a', 'A');  // "AnimAl"

        String result = "AniMaL   ".trim().toLowerCase().replace('a', 'A');

        System.out.println(result);
    }

    private static void method2() {
        StringBuilder alpha = new StringBuilder();

        for (char current = 'a'; current <= 'z'; current++) {
            alpha.append(current);
        }
        out.println(alpha);
    }
    private static void method3() {
        StringBuilder alpha = new StringBuilder("start");
        alpha.append("+middle");
        alpha.append(true);
        StringBuilder append = alpha.append("+end");
        out.println(alpha);
        out.println(append);
    }
}

