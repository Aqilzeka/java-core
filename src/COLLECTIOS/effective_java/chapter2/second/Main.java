package effective_java.chapter2.second;

public class Main {

    static {
        System.out.println("Hello 1");
        Main.main(new String[]{"a"});
    }
    {
        System.out.println("Hello 4");
    }

    public static void main(String[] args) {


        System.out.println("Hello 3");
//        NutritionFacts cocaCola = new NutritionFacts.Builder(240, 8)
//                .calories(100)
//                .sodium(35)
//                .carbohydrate(27).build();
//
//        NyPizza pizza = new NyPizza.Builder(SMALL)
//                .addTopping(SAUSAGE)
//                .addTopping(ONION).build();
//
//        Calzone calzone = new Calzone.Builder()
//                .addTopping(HAM)
//                .sauceInside().build();




    }
    {
        System.out.println("Hello 5");
    }

    static {
        System.out.println("Hello 2");
    }
}
