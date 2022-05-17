package effective_java.builder.fourth;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.IntStream;

public class Test {
    public static void main(String[] args) {
        int nano = LocalTime.now().getSecond();

        long sum = 0L;

        for (long i = 0; i < Integer.MAX_VALUE ; i++) {
            sum+=i;
        }

        System.out.println(sum);
        System.out.println(LocalTime.now().getSecond() - nano);

    }

    static boolean isRomanNumeral(String s) {

        return s.matches("^(?=.)M*(C[MD]|D?C{0,3})(X[CL]|L?X{0,3})(I[XV]|V?I{0,3})$");

    }
}
