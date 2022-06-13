package javase.chapter3;

import java.util.List;

public class Test3 {

    public static void main(String[] args) {

//        Integer value = 123;
//        if(value instanceof Integer) {}
//        if(value instanceof Integer data) {}  // DOES NOT COMPILE

        Number value = 123;
        if(value instanceof List) {}
        if(value instanceof List data) {}
    }


    static void printIntegersGreaterThan5(Number number) {
        if (number instanceof Integer data && data.compareTo(5) > 0)
            System.out.print(data);
    }
//
//    void printIntegersOrNumbersGreaterThan5(Number number) {
//        if(number instanceof Integer data || data.compareTo(5)>0)
//            System.out.print(data);
//    }
//
//    void printIntegerTwice(Number number) {
//        if (number instanceof Integer data)
//            System.out.print(data.intValue());
//        System.out.print(data.intValue());  // DOES NOT COMPILE
//    }

    void printOnlyIntegers(Number number) {
        if (!(number instanceof Integer data))
            return;
        System.out.print(data.intValue());
    }
}
