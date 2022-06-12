package javase.chapter3;

public class Test1 {

    public static void main(String[] args) {
        int a = 5;
        compareIntegers1(5);
        compareIntegers1(7);
        compareIntegers2(a);
    }

    static void compareIntegers1(Number number) {
        if(number instanceof Integer) {
            Integer data = (Integer)number;
            System.out.println(data.compareTo(5));
        }
    }

    static void compareIntegers2(Number number) {
        if(number instanceof Integer data) {
            System.out.print(data.compareTo(5));
        }
    }

    static void compareIntegers3(Integer number) {

    }
}
