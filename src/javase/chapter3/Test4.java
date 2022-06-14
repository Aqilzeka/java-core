package javase.chapter3;

public class Test4 {
    public static void main(String[] args) {
        Test4 test4 = new Test4();
        test4.print(4);
    }

//    public void print(int a) {
//        System.out.println("int");
//    }
    public void print(Integer a) {
        System.out.println("Integer");
    }
    public void print(long a) {
        System.out.println("long");
    }

    enum Animal {BIRD, FISH, MAMMAL}

    void printLocation(Animal a) {
        int type = switch (a) {
            case BIRD -> 1;
            case FISH -> 2;
            case MAMMAL -> 3;
            default -> 4;
        };
        System.out.print(type);
    }

    static void printReptile(int category) {
        var type = switch (category) {
            case 1, 2 -> "Snake";
            case 3, 4 -> "Lizard";
            case 5, 6 -> "Turtle";
            case 7, 8 -> "Alligator";
            default -> throw new IllegalStateException("Unexpected value: " + category);
        };
        System.out.print(type);
    }
}
