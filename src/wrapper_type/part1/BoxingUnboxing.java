package wrapper_type.part1;

public class BoxingUnboxing {
    public static void main(String[] args) {
        Integer i = 5;
        Integer i2 = new Integer(5);
        Integer i3 =  new Integer(5);
        int i4 = 5;

        System.out.println(i.hashCode());
        System.out.println(i2.hashCode());
        System.out.println(i3.hashCode());
        System.out.println();

        // == compare the objects
        System.out.println("i==i2"+(i==i2));
        System.out.println("i==i3"+(i==i3));
        System.out.println("i3==i2"+(i3==i2));
        System.out.println("i4==i"+(i4==i));
        System.out.println("i4==2"+(i4==i2));
        System.out.println();

        // equals compare the values
        System.out.println("i.equals(i2)"+i.equals(i2));
        System.out.println("i.equals(i3)"+i.equals(i3));
        System.out.println("i3.equals(i2)"+i3.equals(i2));
        System.out.println("i.equals(i4)"+(i.equals(i4)));
        System.out.println("i2.equals(i4)"+(i2.equals(i4)));

    }
}
