package first_step;

public class IfAndSwitch {
    public static void main(String[] args) {
        checkWithIf("4");
        checkWithSwitch("4");
    }

    public static int checkWithIf(String s){
        if (s.equals("1")) {
            System.out.println(1);
            return 1;
        } else if (s.equals("2")) {
            System.out.println(2);

            return 2;
        } else if (s.equals("3")) {
            System.out.println(3);

            return 3;
        } else if (s.equals("4")) {
            System.out.println(4);
            return 4;
        } else{
            System.out.println(0);
            return 0;
        }
    }

    public static int checkWithSwitch(String s){
        System.out.println("--------------------------------------------------------");
        switch (s) {
            case "1" -> {
                System.out.println(1);
                return 1;
            }
            case "2" -> {
                System.out.println(2);
                return 2;
            }
            case "3" -> {
                System.out.println(3);
                return 3;
            }
            case "4" -> {
                System.out.println(4);
                return 4;
            }
            default -> {
                System.out.println(0);
                return 0;
            }
        }
    }
}
