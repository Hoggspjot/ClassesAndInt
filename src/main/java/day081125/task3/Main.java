package day081125.task3;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<User, String> map = new HashMap<>();
        map.put(new User("Bob", 1L),"Admin");
        map.put(new User("Mike", 2L),"Manager");
        map.put(new User("Don", 3L),"User");


        User search = new User("Bob", 1L);

        String getUser = map.get(search);

        System.out.println(getUser);

    }
}


record User(String name, long ID) {

}
