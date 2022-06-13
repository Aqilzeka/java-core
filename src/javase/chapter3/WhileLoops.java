package javase.chapter3;

public class WhileLoops {
    public static void main(String[] args) {


        int a = 0;
        while(a++ < 19) {
            System.out.println(a);
        }
        System.out.println(a);


//        for( ; ; )
//            System.out.println("Hello World");

//        int x = 0;
//        for(long y = 0, z = 4, a = 1; x < 5 ; x++, y++, a++) {
//            System.out.print(y + " "); }
//        System.out.print(x + " ");
//        method1();

//        INNER_LOOP: for (int i = 0; i < 10; i++) {
//            System.out.println();
//
//            for (int j = 0; j < 10; j++) {
//                if (j == 6) {
//                    break ;
//                }
//                System.out.print(j);
//            }
//        }

    }

    static void  method1() {
        int[][] myComplexArray = {{5,2,1,3},{3,9,8,9},{5,7,12,7}};

        OUTER_LOOP:  for(int[] mySimpleArray : myComplexArray) {
            INNER_LOOP:  for(int i=0; i<mySimpleArray.length; i++) {
                System.out.print(mySimpleArray[i]+"\t");
            }
            System.out.println();
        }
    }
}
