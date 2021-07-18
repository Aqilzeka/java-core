package jvm;

public class TestMemory {
    static int i = 0;

//    Click on run as configuration and to the arguments add the following.
//            -verbose:gc -XX:+PrintGCDetails -XX:+PrintGCTimeStamps -Xloggc:C:/log/gc.log
//    This will redirect verbose garbage collection output to a file gc.log.

    public static void main(String[] args) {
        if (i < 28) {
            i++;
            System.out.println(i);
            main(new String[] {(args[0] + args[0]).intern()});
        }
    }
}
