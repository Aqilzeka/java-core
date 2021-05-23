package wrapper_type.part1;

import java.util.Arrays;

public class Test {
    public static User[] users = null;

    public static void main(String[] args) {
        User user = new User();
        User user1 = new User();
        User user2 = new User();
        users = new User[3];

        users[0] = user;
        users[1] = user1;
        users[2] = user2;

        System.out.println(Arrays.toString(users));

    }
}
