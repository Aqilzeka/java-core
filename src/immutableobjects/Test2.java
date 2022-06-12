package immutableobjects;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Test2 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3);
        int factor = 2;

        Stream<Integer> stream = numbers.stream()
                .map(e -> e * factor);

//        factor = 9;

        stream.forEach(System.out::println);
    }
}
