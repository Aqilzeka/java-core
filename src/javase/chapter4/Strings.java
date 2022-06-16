package javase.chapter4;

import java.io.PrintStream;

public class Strings {
    private static final PrintStream out = System.out;

    public static void main(String[] args) {
//        method1();
//        method2();
//        method3();
//        method4();
//        method5();
//        method6();
//        method7();
//        method8();
//        method9();
        method10();
    }



    private static void method1() {
        String name = """
                Fluffy
                A
                """;
        out.println(name);
    }

    private static void method2() {
        out.println(1 + 2);           // 3
        out.println("a" + "b");       // ab
        out.println("a" + "b" + 3);   // ab3
        out.println(1 + 2 + "c");     // 3c
        out.println("c" + 1 + 2);     // c12
        out.println("c" + null);      // cnull
        out.println(null + "c");      // nullc
        out.println(1 + 3 + "A" + 3 * 2 + 4); // 4A64
        out.println(2.2 + "A" + 6.99 + 8.2);
    }

    private static void method3() {
        var name = "animals";
        out.println(name.indexOf('a'));       // 0
        out.println(name.indexOf("al"));      // 4
        out.println(name.indexOf('a', 4));    // 4
        out.println(name.indexOf("al", 5));   // -1
    }

    private static void method4() {
        var name = "animals";

        out.println(name.substring(3));        // mals
        out.println(name.substring(name.indexOf('m'))); // mals
        out.println(name.substring(3, 4));              // m
        out.println(name.substring(3, 7));              // mals
        out.println(name.substring(3, 6));              // mal

        out.println(name.substring(3, 3)); // empty string
        out.println(name.substring(3, 2)); // exception
        out.println(name.substring(3, 8)); // exception
    }

    private static void method5() {
        out.println("abc".equals("ABC"));            // false
        out.println("ABC".equals("ABC"));            // true
        out.println("abc".equalsIgnoreCase("ABC"));  // true
    }

    private static void method6() {
        out.println("abc".startsWith("a")); // true
        out.println("abc".startsWith("A")); // false

        out.println("abc".endsWith("c"));   // true
        out.println("abc".endsWith("a"));   // false

        out.println("abc".contains("b"));   // true
        out.println("abc".contains("B"));   // false
    }

    private static void method7() {
        out.println("abc".strip());                 // abc
        out.println("    a b\t c  \n".strip());        // a b c
        out.println();
        String text = "     a  b     c\t      ";
        out.println(text.trim());          // 3
        out.println(text.strip());         // 3
        out.println(text.stripLeading());  // 5
        out.println(text.stripTrailing()); // 4
    }

    private static void method8() {

        var block = """
                a
                 b
                c""";

        var concat = "       a\n" +
                "    b           \n" +
                " c  ";

        out.println(block.length());
        out.println(concat.length());

        out.println(block.indent(6));

        out.println(concat.indent(-1));
        out.println(concat.indent(0));
        out.println(concat.indent(-4));
        out.println(concat.stripIndent());

    }

    private static void method9() {
        var str = "1y\t2";
        out.println(str);
        out.println(str.translateEscapes());
    }
    private static void method10() {
        out.println(" ".isEmpty()); // false
        out.println("".isEmpty());  // true
        out.println(" ".isBlank()); // true
        out.println("".isBlank());  // true
        out.println("".formatted("Aku"));

        out.println("Hello %s, order %d is ready"
                .formatted("Ali", 1));
    }


}
