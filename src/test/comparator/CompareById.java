package test.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CompareById {
    public static void main(String[] args) {
        List<Person> list = new ArrayList<>();
        list.add(new Person(1,"a"));
        list.add(new Person(4,"f"));
        list.add(new Person(3,"d"));
        list.add(new Person(2,"h"));
        System.out.println("Trước khi sắp xếp: ");
        for (Person p:list) {
            System.out.println(p.getId() + " :" + p.getName());
        }
        System.out.println("Sau khi sắp xếp: ");
        //list.sort((o1, o2) -> o1.getName().compareTo(o2.getName()));
        Collections.sort(list,new CompareByName());
        for (Person p:list
             ) {
            System.out.println(p.getId() + ", " + p.getName());

        }
    }

}