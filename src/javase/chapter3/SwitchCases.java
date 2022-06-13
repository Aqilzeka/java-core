package javase.chapter3;

public class SwitchCases {
    public static void main(String[] args) {

        String word = ";";
        switch(word) {
            case "0":
                System.out.print("Sunday");
                break;
        }

        printSeason(1);
    }

    public static void printSeason(int month) {
        switch(month) {
            case 1, 2, 3:    System.out.print("Winter");
            case 4, 5, 6:    System.out.print("Spring");
            default:         System.out.print("Unknown");
            case 7, 8, 9:    System.out.print("Summer");
            case 10, 11, 12: System.out.print("Fall");
        } }
}
