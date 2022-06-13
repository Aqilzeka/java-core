package javase.chapter3;

public class SwitchCases {
    public static void main(String[] args) {



//        String word = ";";
//        switch(word) {
//            case "0":
//                System.out.print("Sunday");
//                break;
//        }
//        feedAnimals();
//        printSeason(1);


//        var result = switch(word) {
//            case "30" -> "Grizzly";
//            default -> "Panda";
//        };

        printSeason2(7);
    }

    public static String method1() {
        int fish = 3;
        int length = 12;

        return switch(fish) {
            case 1 -> "Goldfish";
            case 2 -> {yield "janj"; }
            case 3 -> {
                if(length > 10) yield "Blobfish";
                else yield "Green";
            }
            default -> "Swordfish";
        };
    }

    public static void printSeason2(int month) {
        switch(month) {
            case 1, 2, 3    -> System.out.print("Winter");
            case 4, 5, 6    -> System.out.print("Spring");
            case 7, 8, 9    -> {
                System.out.println("ashxu");
            }
            case 10, 11, 12 -> System.out.print("Fall");
        } }

    public void printDayOfWeek(int day) {
        var result = switch(day) {
            case 0 -> "Sunday";
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            default -> "Invalid value";
        };
        System.out.print(result);
    }



    public static void printSeason(int month) {
        switch(month) {
            default:
            case 35: case 99:
                System.out.println("sjksjk");
            case 1, 2, 3:    System.out.print("Winter");
            case 4, 5, 6:    System.out.print("Spring");
            case 7, 8, 9:    System.out.print("Summer");
            case 10, 11, 12: System.out.print("Fall");
        } }

    static final int getCookies() { return 4; }
    static void feedAnimals() {
        final int bananas = 3;
        int apples = 2;
        int numberOfAnimals = 3;
        final int cookies = getCookies();
        switch(numberOfAnimals) {
            case bananas:
                System.out.println("Banana");
//            case apples:        // DOES NOT COMPILE
//            case getCookies():  // DOES NOT COMPILE
//            case cookies :      // DOES NOT COMPILE
            case 3 * 5 :
        } }
}
