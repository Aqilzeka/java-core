package javase.chapter1;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Test1 {

    static volatile List<Integer> data;

    public static void main(String... args) {

//        test3();
//        test4();
//        test5();
        test(120);
    }

    public static void test3() {
        data = new ArrayList<>();
        IntStream.range(0, 100).forEachOrdered(data::add);
        System.out.println(data.size());
    }

    public static void test4() {
        Predicate<String> empty = String::isEmpty;
        Predicate<String> notEmpty = empty.negate();

        var result = Stream.generate(() -> "")
                .filter(notEmpty)
                .collect(Collectors.groupingBy(k -> k))
                .entrySet()
                .stream()
                .map(Map.Entry::getValue)
                .flatMap(Collection::stream)
                .collect(Collectors.partitioningBy(notEmpty));

        System.out.println(result);
    }


    public static void test5() {
        int[] array = {6, 9, 8};
        System.out.println("B" + Arrays.binarySearch(array, 9));
        System.out.println("C" + Arrays.compare(array, new int[]{6, 9, 8}));
        System.out.println("M" + Arrays.mismatch(array, new int[]{6, 9, 8}));
    }

    public static void test13() {
        var saturday = 2.0;
    }


    public static void test(short a) {
        System.out.println("short " + a);
    }

    public static void test(int a) {
        System.out.println("int " + a);
    }

    public static void test(long a) {
        System.out.println("long " + a);
    }


}
