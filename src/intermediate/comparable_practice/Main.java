package intermediate.comparable_practice;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
//        ArrayList<Integer> list = new ArrayList<>();
//
//        list.add(13);
//        list.add(7);
//        list.add(2);
//        list.add(3);
//        list.add(11);
//        list.add(5);
//        list.add(17);

//        ArrayList<String> list = new ArrayList<>();
//        list.add("Young");
//        list.add("John");
//        list.add("Grace");
//        list.add("Andrew");
//        list.add("Michael");

        ArrayList<Person> list = new ArrayList<>();
        list.add(new Person("Charlie", 25));
        list.add(new Person("Ben", 35));
        list.add(new Person("Alex", 32));
        list.add(new Person("Daniel", 41));

        Collections.sort(list);
        System.out.println(list);
    }
}
